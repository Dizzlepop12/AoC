package ss.ageofcrafters.armor;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersArmor;

public class ArmorSteelClassic extends ItemArmor{

	public ArmorSteelClassic(ArmorMaterial armorMaterial, int id, int slot) {
		super(armorMaterial, id, slot);
		
		if(slot == 0) {
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelHelmetClassic");
		}else if (slot == 1){
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelPlateClassic");
		}else if (slot == 2){
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelLeggingsClassic");
		}else if (slot == 3){
			this.setTextureName(AgeOfCrafters.modid + ":" + "SteelBootsClassic");

		}
	}
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == AgeOfCraftersArmor.SteelHelmetClassic || itemstack.getItem() == AgeOfCraftersArmor.SteelPlateClassic || itemstack.getItem() == AgeOfCraftersArmor.SteelBootsClassic) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/Steel_layer_1_classic.png";		
		}else if(itemstack.getItem() == AgeOfCraftersArmor.SteelLeggingsClassic) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/Steel_layer_2_classic.png";	
		}else{ 
			return null;
		}
	}

    public void addInformation(ItemStack is, EntityPlayer player, List list, boolean check) {
    	list.add("Classic Carving");
    }
}