package ss.ageofcrafters.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersArmor;
import ss.ageofcrafters.main.AgeOfCraftersItems;

public class DesignerCarvings {
	public DesignerCarvings() {
		
	}
	public static ItemStack getCarvingResult(Item item, Item item2) {
		return getOutput(item, item2);
	}
	public static ItemStack getOutput(Item item, Item item2){
		//Recipe: EXAMPLE
		if(item == AgeOfCraftersItems.ClassicBook && item2 == AgeOfCraftersArmor.SteelHelmet ) {
			return new ItemStack(AgeOfCraftersArmor.SteelHelmetClassic, 1);
			
		}
		if(item == AgeOfCraftersItems.ClassicBook && item2 == AgeOfCraftersArmor.SteelPlate ) {
			return new ItemStack(AgeOfCraftersArmor.SteelPlateClassic, 1);
			
		}
		if(item == AgeOfCraftersItems.ClassicBook && item2 == AgeOfCraftersArmor.SteelLeggings ) {
			return new ItemStack(AgeOfCraftersArmor.SteelLeggingsClassic, 1);
			
		}
		if(item == AgeOfCraftersItems.ClassicBook && item2 == AgeOfCraftersArmor.SteelBoots ) {
			return new ItemStack(AgeOfCraftersArmor.SteelBootsClassic, 1);
			
		}
		if(item == AgeOfCraftersItems.ClassicBook && item2 == AgeOfCraftersArmor.SteelHelmet ) {
			return new ItemStack(AgeOfCraftersArmor.SteelHelmetClassic, 1);
			
		}
		if(item == AgeOfCraftersItems.ClassicBook && item2 == Item.getItemFromBlock(Blocks.stonebrick)){
			return new ItemStack(Blocks.stonebrick,1, 3);
		}
		
		return null;
	}
}
