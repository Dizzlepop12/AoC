package ss.ageofcrafters.blocks;

import java.util.List;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAoCPillars extends BlockLog{

	@SideOnly(Side.CLIENT)
	private IIcon[] topTexture;
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	

	static String [] nameArray = new String [] {""};
	
	public BlockAoCPillars(Material material, String[] name){
		super();
		this.nameArray = name;
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister ireg){
		this.field_150167_a = new IIcon[nameArray.length];
		this.field_150166_b = new IIcon[nameArray.length];
		
		for (int i =0; i < this.field_150167_a.length; i++){
			this.field_150167_a[i] = ireg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
			this.field_150166_b[i] = ireg.registerIcon(AgeOfCrafters.modid + ":" + "AoCSlabs-"  + this.getUnlocalizedName().substring(16) + "_top");

		}

	}
	

    
	public int damageDropped(int meta) {
		return meta;
	}
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return null;
    }

}
	