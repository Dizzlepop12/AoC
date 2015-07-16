package ss.ageofcrafters.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import ss.ageofcrafters.main.AgeOfCrafters;

public class BlockBoneBlock extends Block{

	public BlockBoneBlock(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register){
		this.blockIcon = register.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
