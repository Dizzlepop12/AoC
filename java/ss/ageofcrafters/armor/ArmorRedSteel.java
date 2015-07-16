package ss.ageofcrafters.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersArmor;

public class ArmorRedSteel extends ItemArmor{

	public ArmorRedSteel(ArmorMaterial armorMaterial, int id, int slot) {
		super(armorMaterial, id, slot);
		
		if(slot == 0) {
			this.setTextureName(AgeOfCrafters.modid + ":" + "RedSteelHelmet");
		}else if (slot == 1){
			this.setTextureName(AgeOfCrafters.modid + ":" + "RedSteelPlate");
		}else if (slot == 2){
			this.setTextureName(AgeOfCrafters.modid + ":" + "RedSteelLeggings");
		}else if (slot == 3){
			this.setTextureName(AgeOfCrafters.modid + ":" + "RedSteelBoots");
		}
	}
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == AgeOfCraftersArmor.RedSteelHelmet || itemstack.getItem() == AgeOfCraftersArmor.RedSteelPlate || itemstack.getItem() == AgeOfCraftersArmor.RedSteelBoots) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/RedSteel_layer_1.png";		
		}else if(itemstack.getItem() == AgeOfCraftersArmor.RedSteelLeggings) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/RedSteel_layer_2.png";	
		}
			return null;
		}
	

	}
