package ss.ageofcrafters.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import ss.ageofcrafters.main.AgeOfCraftersItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWineGoblet extends ItemFood{
	
	

	public ItemWineGoblet(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setPotionEffect(9, 20, 2, 0.6f);
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
	    {
	        --itemstack.stackSize;
	        player.getFoodStats().func_151686_a(this, itemstack);
	        player.inventory.addItemStackToInventory(new ItemStack(AgeOfCraftersItems.Goblet));
	        world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
	        this.onFoodEaten(itemstack, world, player);
	        return itemstack;
	    }
	
	 public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float hitx, float hity, float hitz)
	    {
	    
	    		if(player.canPlayerEdit(x, y + 1, z, side, itemstack)){
	    			if(world.getBlock(x,y,z) != AgeOfCraftersBlocks.WineGobletBlock){
	    				if(side == 1){
	    					world.setBlock(x, y + 1, z, AgeOfCraftersBlocks.WineGobletBlock);
						--itemstack.stackSize;
	    			}else{
	    				return false;
	    				}
	    			}
	    		}
				return true;
	    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	@Override
	public EnumAction getItemUseAction(ItemStack p_77661_1_)
	    {
	        return EnumAction.drink;
	    }
	
}
