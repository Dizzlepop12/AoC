package ss.ageofcrafters.blocks;

import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBindweed extends BlockVine{
	
	public BlockBindweed(Material material){
		super();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg)
	{
		this.blockIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	 @SideOnly(Side.CLIENT)
	    public int getBlockColor()
	    {
	        return 0;
	    }

	    /**
	     * Returns the color this block should be rendered. Used by leaves.
	     */
	    @SideOnly(Side.CLIENT)
	    public int getRenderColor(int p_149741_1_)
	    {
	        return 0;
	    }
	    
	    public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity){
	    	return false;
	    }
}
