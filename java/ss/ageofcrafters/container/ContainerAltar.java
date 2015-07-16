package ss.ageofcrafters.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import ss.ageofcrafters.blocks.tileentities.TileEntityAltar;
import ss.ageofcrafters.slot.SlotAltar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerAltar extends Container {

	private TileEntityAltar altar;
	private int dualCookTime;
	private int dualPower;
	
	public ContainerAltar(InventoryPlayer invPlayer, TileEntityAltar teAltar){
		dualCookTime = 0;
		dualPower = 0;
		
		altar = teAltar;
		
		this.addSlotToContainer(new Slot ((IInventory)altar, 0, 29, 14));
		this.addSlotToContainer(new Slot ((IInventory)altar, 1, 47, 14));
		this.addSlotToContainer(new Slot ((IInventory) altar, 2, 55, 52));
		this.addSlotToContainer(new SlotAltar(invPlayer.player, altar, 3, 116, 35));

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 9; j++){
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		for(int i = 0; i < 9; i++){
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return altar.isUseableByPlayer(player);
	}


	
	public void addCraftingToCrafters(ICrafting crafting)
    {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.altar.createTime);
        crafting.sendProgressBarUpdate(this, 1, this.altar.power);
    }
	

	
	public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (p_82846_2_ != 1 && p_82846_2_ != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (altar.hasItemPower(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (p_82846_2_ >= 3 && p_82846_2_ < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (p_82846_2_ >= 30 && p_82846_2_ < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(p_82846_1_, itemstack1);
        }

        return itemstack;
    }
	
	 public void detectAndSendChanges()
	    {
	        super.detectAndSendChanges();

	        for (int i = 0; i < this.crafters.size(); ++i)
	        {
	            ICrafting icrafting = (ICrafting)this.crafters.get(i);

	            if (this.dualCookTime != this.altar.createTime)
	            {
	                icrafting.sendProgressBarUpdate(this, 0, this.altar.createTime);
	            }

	            if (this.dualPower != this.altar.power)
	            {
	                icrafting.sendProgressBarUpdate(this, 1, this.altar.power);
	            }
	        }
	        this.dualCookTime = this.altar.createTime;
			this.dualPower = this.altar.power;

	    }
	
	 @SideOnly(Side.CLIENT)
	    public void updateProgressBar(int i, int j)
	    {
	        if (i == 0)
	        {
	            this.altar.createTime = j;
	        }

	        if (i == 1)
	        {
	            this.altar.power = j;
	        }

	    }
}