package ss.ageofcrafters.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAoCTiles extends Block{

	public BlockAoCTiles(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
