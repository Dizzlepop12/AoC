package ss.ageofcrafters.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersArmor;

public class ArmorManAtArms extends ItemArmor{


	public ArmorManAtArms(ArmorMaterial armorMaterial, int id, int slot) {
		super(armorMaterial, id, slot);
		
		if(slot == 0) {
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelHelmet-manAtArms");
		}
	}
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == AgeOfCraftersArmor.ManAtArmsHelmet) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/ManAtArms.png";		
		}else{ 
			return null;
		}
	}

}