package ss.ageofcrafters.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCraftersItems;

public class Alloys {


	
	public Alloys() {
		
	}
	public static ItemStack getAlloy(Item item, Item item2) {
		return getOutput(item, item2);
	}
	public static ItemStack getOutput(Item item, Item item2){

		
		//Recipe: EXAMPLE
		if(item == Items.iron_ingot && item2 == Items.iron_ingot ) {
			return new ItemStack(AgeOfCraftersItems.SteelIngot, 1);
			
		}
		if(item == AgeOfCraftersItems.CopperIngot && item2 == AgeOfCraftersItems.TinIngot){
			return new ItemStack(AgeOfCraftersItems.BronzeIngot, 2);
		}
		if(item == AgeOfCraftersItems.SteelIngot && item2 == Item.getItemFromBlock(Blocks.redstone_block)) {
			return new ItemStack(AgeOfCraftersItems.RedSteelIngot, 1);
		}
		
		return null;
	}
	
}
