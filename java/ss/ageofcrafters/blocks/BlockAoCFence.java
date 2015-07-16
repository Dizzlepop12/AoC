package ss.ageofcrafters.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAoCFence extends BlockFence{

	public static Block extensor;
	
	public static String string1;
	
	public BlockAoCFence(Block block, Material blockMaterial) {
		super(string1, blockMaterial);
		blockMaterial = this.blockMaterial;
		this.extensor = block;
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + extensor.getUnlocalizedName().substring(5));
	}
	
	
	 @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int side, int meta)
	    {
	        return extensor.getBlockTextureFromSide(side);
	    }
	    @SideOnly(Side.CLIENT)
	    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
	    {
	        list.add(new ItemStack(item, 1, 0));
	    }

}
