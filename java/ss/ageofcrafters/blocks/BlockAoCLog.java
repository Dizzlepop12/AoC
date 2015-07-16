package ss.ageofcrafters.blocks;

import java.util.List;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAoCLog extends BlockLog{

	@SideOnly(Side.CLIENT)
	private IIcon[] topTexture;
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String [] logs = new String [] {"pine", "olive"};
	
	public BlockAoCLog(Material material){
		super();
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister ireg){
		this.field_150167_a = new IIcon[logs.length];
		this.field_150166_b = new IIcon[logs.length];
		
		for (int i =0; i < this.field_150167_a.length; i++){
			this.field_150167_a[i] = ireg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5) + "-" + logs[i]);
			this.field_150166_b[i] = ireg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5) + "-" + logs[i] + "_top");

		}

	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs ctabs,List list){
		
		for(int i = 0; i < logs.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
		
	}
	
    
    
	public int damageDropped(int meta) {
		return meta;
	}
    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
}
	