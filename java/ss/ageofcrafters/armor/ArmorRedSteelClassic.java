package ss.ageofcrafters.armor;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersArmor;

public class ArmorRedSteelClassic extends ItemArmor{

	public ArmorRedSteelClassic(ArmorMaterial armorMaterial, int id, int slot) {
		super(armorMaterial, id, slot);
		
		if(slot == 0) {
			this.setTextureName(AgeOfCrafters.modid + ":" + "RedSteelHelmetClassic");
		}else if (slot == 1){
			this.setTextureName(AgeOfCrafters.modid + ":" + "RedSteelPlateClassic");
		}else if (slot == 2){
			this.setTextureName(AgeOfCrafters.modid + ":" + "RedSteelLeggingsClassic");
		}else if (slot == 3){
			this.setTextureName(AgeOfCrafters.modid + ":" + "RedSteelBootsClassic");
		}
	}
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == AgeOfCraftersArmor.RedSteelHelmetClassic || itemstack.getItem() == AgeOfCraftersArmor.RedSteelPlateClassic || itemstack.getItem() == AgeOfCraftersArmor.RedSteelBootsClassic) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/RedSteelClassic_layer_1.png";		
		}else if(itemstack.getItem() == AgeOfCraftersArmor.RedSteelLeggingsClassic) {
				return AgeOfCrafters.modid + ":" + "textures/model/armor/RedSteelClassic_layer_2.png";	
		}
			return null;
		}
	@Override
    public void addInformation(ItemStack is, EntityPlayer player, List list, boolean arg1){
    	list.add("Carved");
    	list.add("Classic");
    	}
	}
