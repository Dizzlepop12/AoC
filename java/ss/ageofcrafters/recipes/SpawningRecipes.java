package ss.ageofcrafters.recipes;

import ss.ageofcrafters.main.AgeOfCraftersItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SpawningRecipes {

	
	public static ItemStack getSpawnRecipe(Item item, Item item2) {
		return getOutput(item, item2);
	}
	public static ItemStack getOutput(Item item, Item item2){

		
		//Recipe: EXAMPLE
		if(item == Items.iron_ingot && item2 == Items.iron_ingot ) {
			return new ItemStack(AgeOfCraftersItems.SteelIngot, 1);
			
		}
		
		return null;
	}
}
