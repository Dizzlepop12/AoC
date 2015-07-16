package ss.ageofcrafters.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersArmor;

public class ArmorBronze extends ItemArmor{

	public ArmorBronze(ArmorMaterial armorMaterial, int id, int slot) {
		super(armorMaterial, id, slot);
		
		if(slot == 0) {
			this.setTextureName(AgeOfCrafters.modid + ":" + "BronzeHelmet");
		}else if (slot == 1){
			this.setTextureName(AgeOfCrafters.modid + ":" + "BronzePlate");
		}else if (slot == 2){
			this.setTextureName(AgeOfCrafters.modid + ":" + "BronzeLeggings");
		}else if (slot == 3){
			this.setTextureName(AgeOfCrafters.modid + ":" + "BronzeBoots");

		}
	}
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == AgeOfCraftersArmor.BronzeHelmet || itemstack.getItem() == AgeOfCraftersArmor.BronzePlate || itemstack.getItem() == AgeOfCraftersArmor.BronzeBoots) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/Bronze_layer_1.png";		
		}else if(itemstack.getItem() == AgeOfCraftersArmor.BronzeLeggings) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/Bronze_layer_2.png";	
		}
			return null;
		}
	}
