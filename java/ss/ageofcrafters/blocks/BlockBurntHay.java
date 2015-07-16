package ss.ageofcrafters.blocks;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBurntHay extends BlockLog{

	@SideOnly(Side.CLIENT)
	private IIcon topTexture;
	
	public BlockBurntHay(Material mat){
		super();
			
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
		this.topTexture = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5) + "_top");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		if(side == 0 || side == 1){
			return this.topTexture;
		}
		
		return this.blockIcon;
	}
}
