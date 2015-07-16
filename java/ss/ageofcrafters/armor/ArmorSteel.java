package ss.ageofcrafters.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersArmor;
import ss.ageofcrafters.main.AgeOfCraftersItems;

public class ArmorSteel extends ItemArmor{

	public ArmorSteel(ArmorMaterial armorMaterial, int id, int slot) {
		super(armorMaterial, id, slot);
		
		if(slot == 0) {
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelHelmet");
		}else if (slot == 1){
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelPlate");
		}else if (slot == 2){
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelLeggings");
		}else if (slot == 3){
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelBoots");

		}
	}
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == AgeOfCraftersArmor.SteelHelmet || itemstack.getItem() == AgeOfCraftersArmor.SteelPlate || itemstack.getItem() == AgeOfCraftersArmor.SteelBoots) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/Steel_layer_1.png";		
		}else if(itemstack.getItem() == AgeOfCraftersArmor.SteelLeggings) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/Steel_layer_2.png";	
		}else{ 
			return null;
		}
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	  return stack.getItem() == AgeOfCraftersItems.SteelIngot; 
	}
}