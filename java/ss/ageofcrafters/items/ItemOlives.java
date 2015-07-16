package ss.ageofcrafters.items;

import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class ItemOlives extends ItemFood {

	public ItemOlives(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
	}
	
	public int getMaxItemUseDuration(ItemStack is){
		return 20;
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}