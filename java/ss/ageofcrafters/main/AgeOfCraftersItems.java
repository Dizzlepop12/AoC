/**
 * This file is a part of AGE OF CRAFTERS. If you're using a portion of code or code edited using this file's code as base, you
 * must mention that in the site you're uploading your mod, or in the mcmod.info credits.
 * CODED & TEXTURED BY QUACKIE_THE_DUCK and SSILVAMC
 * CONTENT IDEAS BY SSILVAMC, QUACKIE_THE_DUCK, KOOKYBOY9 and SO MUCH MORE
 * IDEAS from WIKIPEDIA.ORG, BEN-HUR: A TALE OF CHRIST, AGE OF EMPIRES SERIES by MICROSOFT CORPORATION
 * 
 */
package ss.ageofcrafters.main;

import cpw.mods.fml.common.registry.GameRegistry;
import ss.ageofcrafters.items.ClassicBook;
import ss.ageofcrafters.items.CorinthianBook;
import ss.ageofcrafters.items.ItemAoCBook;
import ss.ageofcrafters.items.ItemAsianDoor;
import ss.ageofcrafters.items.ItemCarver;
import ss.ageofcrafters.items.ItemCoin;
import ss.ageofcrafters.items.ItemGoblet;
import ss.ageofcrafters.items.ItemGrape;
import ss.ageofcrafters.items.ItemGrapeSeeds;
import ss.ageofcrafters.items.ItemIngot;
import ss.ageofcrafters.items.ItemOlives;
import ss.ageofcrafters.items.ItemWallCarpetPersian;
import ss.ageofcrafters.items.ItemWineGoblet;
import ss.ageofcrafters.items.VanillaBook;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class AgeOfCraftersItems {

	public static Item BronzeIngot;
	public static Item PlatinumIngot;
	public static Item SteelIngot;
	public static Item TinIngot;
	public static Item CopperIngot;
	public static Item RedSteelIngot;
	public static Item WineGoblet;
	public static Item ClassicBook;
	public static Item VanillaBook;
	public static Item CorinthianBook;
	public static Item PhalanxBook;
	public static Item Carver;
	public static Item BronzeCoin;
	public static Item SilverCoin;
	public static Item GoldCoin;
	public static Item Goblet;
	public static Item AsianDoor;
	public static Item Grape;
	public static Item GrapeSeeds;
	public static Item Olives;
	
	public static CreativeTabs TabMain = AgeOfCrafters.TabMain;
	public static CreativeTabs TabSpawners = AgeOfCrafters.TabSpawners;
	
	public static void init() {
		BronzeIngot = new ItemIngot().setUnlocalizedName("AoBIngot-bronze").setCreativeTab(TabMain);
		SteelIngot = new ItemIngot().setUnlocalizedName("AoBIngot-steel").setCreativeTab(TabMain);
		TinIngot = new ItemIngot().setUnlocalizedName("AoBIngot-tin").setCreativeTab(TabMain);
		CopperIngot = new ItemIngot().setUnlocalizedName("AoBIngot-copper").setCreativeTab(TabMain);
		RedSteelIngot = new ItemIngot().setUnlocalizedName("AoBIngot-redSteel").setCreativeTab(TabMain);
		Carver = new ItemCarver().setUnlocalizedName("AoBItems-carver").setCreativeTab(TabMain).setMaxStackSize(1);
		PhalanxBook = new ItemAoCBook().setUnlocalizedName("AoBBooks-phalanx").setCreativeTab(TabMain);
		CorinthianBook = new ItemAoCBook().setUnlocalizedName("AoBBooks-corinthian").setCreativeTab(TabMain);
		ClassicBook = new ItemAoCBook().setUnlocalizedName("AoBBooks-classic").setCreativeTab(TabMain);
		VanillaBook = new ItemAoCBook().setUnlocalizedName("AoBBooks-vanilla").setCreativeTab(TabMain);
		BronzeCoin = new ItemCoin().setUnlocalizedName("AoBCoins-bronze").setCreativeTab(TabMain);
		SilverCoin = new ItemCoin().setUnlocalizedName("AoBCoins-silver").setCreativeTab(TabMain);
		GoldCoin = new ItemCoin().setUnlocalizedName("AoBCoins-gold").setCreativeTab(TabMain);
		Grape = new ItemGrape(2, 1, false).setUnlocalizedName("AoBFood-grape").setCreativeTab(TabMain);
		GrapeSeeds = new ItemGrapeSeeds(AgeOfCraftersBlocks.GrapeCrop, Blocks.farmland).setCreativeTab(TabMain).setUnlocalizedName("AoBSeeds-grape");
		WineGoblet = new ItemWineGoblet(5, 2.5F, false).setCreativeTab(TabMain).setUnlocalizedName("WineGoblet");
		Goblet = new ItemGoblet().setCreativeTab(TabMain).setUnlocalizedName("Goblet");
		AsianDoor = new ItemAsianDoor(Material.wood).setUnlocalizedName("AsianDoorItem").setCreativeTab(TabMain);
		Olives = new ItemOlives(2, 2, false).setUnlocalizedName("AoBFood-olive").setCreativeTab(TabMain);
		
	}
	
	public static void register(){
		registerItem(TinIngot);
		registerItem(CopperIngot);
		registerItem(RedSteelIngot);
		registerItem(SteelIngot);
		registerItem(BronzeIngot);
		registerItem(Carver);
		registerItem(PhalanxBook);
		registerItem(VanillaBook);
		registerItem(ClassicBook);
		registerItem(CorinthianBook);
		registerItem(GoldCoin);
		registerItem(SilverCoin);
		registerItem(BronzeCoin);
		registerItem(WineGoblet);
		registerItem(Goblet);
		registerItem(AsianDoor);
		registerItem(Grape);
		registerItem(GrapeSeeds);
		registerItem(Olives);
	}
	
	/**
	 * Short for GameRegistry.registerItem.
	 * @param item | item that is going to be registered.
	 *  
	 *  
	 **/
	public static void registerItem(Item item){
		GameRegistry.registerItem(item, item.getUnlocalizedName());
	}
}
