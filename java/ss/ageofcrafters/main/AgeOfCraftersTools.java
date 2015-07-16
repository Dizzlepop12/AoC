/**
 * This file is a part of AGE OF CRAFTERS. If you're using a portion of code or code edited using this file's code as base, you
 * must mention that in the site you're uploading your mod, or in the mcmod.info credits.
 * CODED & TEXTURED BY QUACKIE_THE_DUCK and SSILVAMC
 * CONTENT IDEAS BY SSILVAMC, QUACKIE_THE_DUCK, KOOKYBOY9 and SO MUCH MORE
 * IDEAS from WIKIPEDIA.ORG, BEN-HUR: A TALE OF CHRIST, AGE OF EMPIRES SERIES by MICROSOFT CORPORATION
 * 
 */
package ss.ageofcrafters.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.util.EnumHelper;
import ss.ageofcrafters.tools.ItemAoCAxe;
import ss.ageofcrafters.tools.ItemAoCPickaxe;
import ss.ageofcrafters.tools.ItemAoCSpade;
import ss.ageofcrafters.weapons.ItemAoCSword;
import ss.ageofcrafters.weapons.ItemClub;
import ss.ageofcrafters.weapons.ItemHopliteSpear;
import cpw.mods.fml.common.registry.GameRegistry;

public class AgeOfCraftersTools {

	public static Item SteelSword;
	public static Item SteelPickaxe;
	public static Item SteelAxe;
	public static Item SteelSpade;
	public static Item BronzePickaxe;
	public static Item BronzeAxe;
	public static Item BronzeSpade;
	public static Item BronzeSword;
	public static Item RedSteelPickaxe;
	public static Item RedSteelAxe;
	public static Item RedSteelSpade;
	public static Item RedSteelSword;
	public static Item SilexPickaxe;
	public static Item SilexAxe;
	public static Item SilexSpade;
	public static Item SilexSword;	
	public static Item Club;
	public static Item Crossbow;
	public static Item HuntingSpear;
	public static Item HopliteSpear;


	public static CreativeTabs TabMain = AgeOfCrafters.TabMain;
	public static CreativeTabs TabSpawners = AgeOfCrafters.TabSpawners;
	
	public static ToolMaterial TRedSteel = EnumHelper.addToolMaterial("TRedSteel", 3, 2000, 7.0F, 5F, 20);
	public static ToolMaterial TSteel = EnumHelper.addToolMaterial("TSteel", 2, 500, 6.5F, 2.0F, 14);
	public static ToolMaterial TBronze = EnumHelper.addToolMaterial("TBronze", 2, 200, 5.0F, 2F, 25);
	public static ToolMaterial TSilex = EnumHelper.addToolMaterial("TSilex", 1, 200, 3.2f, 1.5F, 10);

	public static Item BronzeIngot = AgeOfCraftersItems.BronzeIngot;
	public static Item SteelIngot = AgeOfCraftersItems.SteelIngot;
	public static Item RedSteelIngot = AgeOfCraftersItems.RedSteelIngot;

	public static void init() {
		
		BronzeAxe = new ItemAoCAxe(TBronze, BronzeIngot).setUnlocalizedName("AoBAxes-bronze").setCreativeTab(TabMain);
		BronzePickaxe = new ItemAoCPickaxe(TBronze, BronzeIngot).setUnlocalizedName("AoBPickaxes-bronze").setCreativeTab(TabMain);
		BronzeSpade = new ItemAoCSpade(TBronze, BronzeIngot).setUnlocalizedName("AoBSpades-bronze").setCreativeTab(TabMain);
		BronzeSword = new ItemAoCSword(TBronze, BronzeIngot).setUnlocalizedName("AoBSwords-bronze").setCreativeTab(TabMain);
		SteelAxe = new ItemAoCAxe(TSteel, SteelIngot).setUnlocalizedName("SteelAxe").setCreativeTab(TabMain);
		SteelPickaxe = new ItemAoCPickaxe(TSteel, SteelIngot).setUnlocalizedName("SteelPickaxe").setCreativeTab(TabMain);
		SteelSpade = new ItemAoCSpade(TSteel, SteelIngot).setUnlocalizedName("SteelSpade").setCreativeTab(TabMain);
		SteelSword = new ItemAoCSword(TSteel, SteelIngot).setUnlocalizedName("SteelSword").setCreativeTab(TabMain);
		RedSteelAxe = new ItemAoCAxe(TRedSteel, RedSteelIngot).setUnlocalizedName("RedSteelAxe").setCreativeTab(TabMain);
		RedSteelPickaxe = new ItemAoCPickaxe(TRedSteel, RedSteelIngot).setUnlocalizedName("RedSteelPickaxe").setCreativeTab(TabMain);
		RedSteelSpade = new ItemAoCSpade(TRedSteel, RedSteelIngot).setUnlocalizedName("RedSteelSpade").setCreativeTab(TabMain);
		RedSteelSword = new ItemAoCSword(TRedSteel, RedSteelIngot).setUnlocalizedName("RedSteelSword").setCreativeTab(TabMain);
		SilexAxe = new ItemAoCAxe(TSilex, Items.flint).setUnlocalizedName("SilexAxe").setCreativeTab(TabMain);
		SilexPickaxe = new ItemAoCPickaxe(TSilex, Items.flint).setUnlocalizedName("SilexPickaxe").setCreativeTab(TabMain);
		SilexSpade = new ItemAoCSpade(TSilex, Items.flint).setUnlocalizedName("SilexSpade").setCreativeTab(TabMain);
		SilexSword = new ItemAoCSword(TSilex, Items.flint).setUnlocalizedName("SilexSword").setCreativeTab(TabMain);
		Club = new ItemClub(ToolMaterial.WOOD).setUnlocalizedName("AoBWeapons-club").setCreativeTab(TabMain);
		HopliteSpear =  new ItemHopliteSpear(ToolMaterial.IRON).setUnlocalizedName("AoCWeapons-hopliteSpear").setCreativeTab(TabMain);
		/*INITIALIZE HERE*/
	}
	
	public static void register(){
		registerItem(BronzeSword);
		registerItem(BronzeSpade);
		registerItem(BronzeAxe);
		registerItem(BronzePickaxe);		
		registerItem(SteelSword);
		registerItem(SteelSpade);
		registerItem(SteelAxe);
		registerItem(SteelPickaxe);
		registerItem(RedSteelSword);
		registerItem(RedSteelSpade);
		registerItem(RedSteelAxe);
		registerItem(RedSteelPickaxe);
		registerItem(SilexSword);
		registerItem(SilexSpade);
		registerItem(SilexAxe);
		registerItem(SilexPickaxe);
		registerItem(Club);
		registerItem(HopliteSpear);
	}
	
	public static void registerItem(Item item){
		GameRegistry.registerItem(item, item.getUnlocalizedName());
	}
}
