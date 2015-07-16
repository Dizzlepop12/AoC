package ss.ageofcrafters.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Halberd extends Item{
	public Halberd(){
		super();
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
