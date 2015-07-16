package ss.ageofcrafters.blocks;

import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPineLeaves extends BlockLeaves{


	public BlockPineLeaves(Material material){
		super();
	}
	
	 public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return Item.getItemFromBlock(AgeOfCraftersBlocks.AoBSaplings);
	    }
	
	@SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
        return 38956;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
       this.blockIcon = iconRegister.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
    }

	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	@Override
	public boolean shouldSideBeRendered(IBlockAccess iba, int x, int y, int z, int side){
		return true;
	}

	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return blockIcon;
	}

	@Override
	public String[] func_150125_e() {
		return null;
	}
}
