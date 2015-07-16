package ss.ageofcrafters.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import ss.ageofcrafters.main.AgeOfCrafters;

public class ItemIngot extends Item{
	public ItemIngot(){
		super();
	}
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
