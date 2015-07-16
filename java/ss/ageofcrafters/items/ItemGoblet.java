package ss.ageofcrafters.items;

import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGoblet extends Item{
	
	public static BlockBush block1;
	public static BlockTallGrass block2;
	
	public ItemGoblet(){
		super();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}

    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float hitx, float hity, float hitz)
    {
    
    		if(player.canPlayerEdit(x, y + 1, z, side, itemstack)){
    			if(world.getBlock(x,y,z) != AgeOfCraftersBlocks.GobletBlock){
    				if(side == 1){
    					world.setBlock(x, y + 1, z, AgeOfCraftersBlocks.GobletBlock);
					--itemstack.stackSize;
    			}else{
    				return false;
    				}
    			}
    		}
			return true;
    }

}
