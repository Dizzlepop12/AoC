package ss.ageofcrafters.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAoCPlanks extends Block{

	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String [] subBlocks = new String [] {"pine", "olive"};
	
	public BlockAoCPlanks(Material material){
		super(material);
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(AgeOfCrafters.modid + ":" + "AoBPlanks-" + subBlocks[i]);
		}
	}	
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs ctabs,List list){		
		for(int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}		
	}	
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return texture[meta];
	}
	
	public int damageDropped(int meta) {
		return meta;
	}
	
	
}
	