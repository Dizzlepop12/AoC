package ss.ageofcrafters.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersArmor;

public class ArmorPlatinum extends ItemArmor{

	public ArmorPlatinum(ArmorMaterial armorMaterial, int id, int slot) {
		super(armorMaterial, id, slot);
		
		if(slot == 0) {
			this.setTextureName(AgeOfCrafters.modid + ":" + "PlatinumHelmet");
		}else if (slot == 1){
			this.setTextureName(AgeOfCrafters.modid + ":" + "PlatinumPlate");
		}else if (slot == 2){
			this.setTextureName(AgeOfCrafters.modid + ":" + "PlatinumLeggings");
		}else if (slot == 3){
			this.setTextureName(AgeOfCrafters.modid + ":" + "PlatinumBoots");

		}
	}
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == AgeOfCraftersArmor.PlatinumHelmet || itemstack.getItem() == AgeOfCraftersArmor.PlatinumPlate || itemstack.getItem() == AgeOfCraftersArmor.SteelBoots) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/Platinum_layer_1.png";		
		}else if(itemstack.getItem() == AgeOfCraftersArmor.PlatinumLeggings) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/Platinum_layer_2.png";	
		}else{ 
			return null;
		}
	}
}