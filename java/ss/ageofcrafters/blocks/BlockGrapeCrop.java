package ss.ageofcrafters.blocks;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrapeCrop extends BlockCrops{

	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;
	

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.iconArray = new IIcon[3];
		
		for(int i = 0; i < this.iconArray.length; i++){
			this.iconArray[i] = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5) + "." + (i + 1));
		}
	}

	public IIcon getIcon(int side, int metadata){
		if(metadata < 7){
			if(metadata == 6){
				metadata = 5;
			}
			
			return this.iconArray[metadata >> 1];
		}
		return this.iconArray[2];
	}
	public int quantityDropped(Random random){
		return 3;
	}
	protected Item func_149866_i(){
		return AgeOfCraftersItems.GrapeSeeds;
	}
	
	protected Item func_149865_P(){
		return AgeOfCraftersItems.Grape;
	}
}
