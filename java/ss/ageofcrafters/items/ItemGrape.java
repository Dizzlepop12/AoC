package ss.ageofcrafters.items;

import ss.ageofcrafters.main.AgeOfCrafters;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrape extends ItemFood {

	public ItemGrape(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
	}

	public int getMaxItemUseDuration(ItemStack is){
		return 24;
		
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
