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
import ss.ageofcrafters.armor.ArmorBronze;
import ss.ageofcrafters.armor.ArmorManAtArms;
import ss.ageofcrafters.armor.ArmorPlatinum;
import ss.ageofcrafters.armor.ArmorRedSteel;
import ss.ageofcrafters.armor.ArmorRedSteelClassic;
import ss.ageofcrafters.armor.ArmorSteel;
import ss.ageofcrafters.armor.ArmorSteelClassic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AgeOfCraftersArmor {

	/*Armor Parts*/
	public static Item PlatinumHelmet;
	public static Item PlatinumPlate;
	public static Item PlatinumLeggings;
	public static Item PlatinumBoots;
	public static Item SteelHelmet;
	public static Item SteelPlate;
	public static Item SteelLeggings;
	public static Item SteelBoots;
	public static Item BronzeHelmet;
	public static Item BronzePlate;
	public static Item BronzeLeggings;
	public static Item BronzeBoots;
	public static Item SteelLeggingsClassic;
	public static Item SteelPlateClassic;
	public static Item SteelBootsClassic;
	public static Item SteelHelmetClassic;
	public static Item BronzeCuirass;
	public static Item RedSteelHelmet;
	public static Item RedSteelPlate;
	public static Item RedSteelLeggings;
	public static Item RedSteelBoots;
	public static Item RedSteelHelmetClassic;
	public static Item RedSteelPlateClassic;
	public static Item RedSteelLeggingsClassic;
	public static Item RedSteelBootsClassic;	
	public static Item ManAtArmsHelmet;

	/*Armor IDs*/	
	public static int SteelHelmetID;
	public static int SteelPlateID;
	public static int SteelLeggingsID;
	public static int SteelBootsID;
	public static int BronzeHelmetID;
	public static int BronzePlateID;
	public static int BronzeLeggingsID;
	public static int BronzeBootsID;
	public static int PlatinumHelmetID;
	public static int PlatinumPlateID;
	public static int PlatinumLeggingsID;
	public static int PlatinumBootsID;
	public static int SteelPlateClassicID;
	public static int SteelLeggingsClassicID;
	public static int SteelBootsClassicID;
	public static int SteelHelmetClassicID;
	public static int RedSteelHelmetID;
	public static int RedSteelPlateID;
	public static int RedSteelLeggingsID;
	public static int RedSteelBootsID;
	public static int RedSteelHelmetClassicID;
	public static int RedSteelPlateClassicID;
	public static int RedSteelLeggingsClassicID;
	public static int RedSteelBootsClassicID;
	public static int ManAtArmsHelmetID;


	public static ArmorMaterial ASteel = EnumHelper.addArmorMaterial("ASteel", 30, new int[]{2, 6, 5, 2}, 15);
	public static ArmorMaterial ARedSteel = EnumHelper.addArmorMaterial("ARedSteel", 40, new int[]{3, 8, 6, 3}, 5);
	public static ArmorMaterial APlatinum = EnumHelper.addArmorMaterial("APlatinum", 20, new int[]{3, 7, 5, 3}, 20);
	public static ArmorMaterial ABronze = EnumHelper.addArmorMaterial("ABronze", 15, new int[]{2, 5, 4, 1}, 25);

	
	public static CreativeTabs TabMain = AgeOfCrafters.TabMain;
	public static CreativeTabs TabSpawners = AgeOfCrafters.TabSpawners;
	
	public static void init() {
		SteelHelmetClassic = new ArmorSteelClassic(ASteel, SteelHelmetClassicID, 0).setUnlocalizedName("SteelHelmetClassic").setCreativeTab(TabMain);
		SteelPlateClassic = new ArmorSteelClassic(ASteel, SteelPlateClassicID, 1).setUnlocalizedName("SteelPlateClassic").setCreativeTab(TabMain);
		SteelLeggingsClassic = new ArmorSteelClassic(ASteel, SteelLeggingsClassicID,2).setUnlocalizedName("SteelLeggingsClassic").setCreativeTab(TabMain);
		SteelBootsClassic = new ArmorSteelClassic(ASteel, SteelBootsClassicID, 3).setUnlocalizedName("SteelBootsClassic").setCreativeTab(TabMain);
		SteelHelmet  = new ArmorSteel(ASteel, SteelHelmetID, 0).setUnlocalizedName("SteelHelmet").setCreativeTab(TabMain);
		SteelPlate = new ArmorSteel(ASteel, SteelPlateID, 1).setUnlocalizedName("SteelPlate").setCreativeTab(TabMain);
		SteelLeggings = new ArmorSteel(ASteel, SteelLeggingsID, 2).setUnlocalizedName("SteelLeggings").setCreativeTab(TabMain);
		SteelBoots = new ArmorSteel(ASteel, SteelBootsID, 3).setUnlocalizedName("SteelBoots").setCreativeTab(TabMain);
		BronzeHelmet  = new ArmorBronze(ABronze, BronzeHelmetID, 0).setUnlocalizedName("BronzeHelmet").setCreativeTab(TabMain);
		BronzePlate = new ArmorBronze(ABronze, BronzePlateID, 1).setUnlocalizedName("BronzePlate").setCreativeTab(TabMain);
		BronzeLeggings = new ArmorBronze(ABronze, BronzeLeggingsID, 2).setUnlocalizedName("BronzeLeggings").setCreativeTab(TabMain);
		BronzeBoots = new ArmorBronze(ABronze, BronzeBootsID, 3).setUnlocalizedName("BronzeBoots").setCreativeTab(TabMain);
		PlatinumHelmet  = new ArmorPlatinum(APlatinum, PlatinumHelmetID, 0).setUnlocalizedName("PlatinumHelmet").setCreativeTab(TabMain);
		PlatinumPlate = new ArmorPlatinum(APlatinum, PlatinumPlateID, 1).setUnlocalizedName("PlatinumPlate").setCreativeTab(TabMain);
		PlatinumLeggings = new ArmorPlatinum(APlatinum, PlatinumLeggingsID, 2).setUnlocalizedName("PlatinumLeggings").setCreativeTab(TabMain);
		PlatinumBoots = new ArmorPlatinum(APlatinum, PlatinumBootsID, 3).setUnlocalizedName("PlatinumBoots").setCreativeTab(TabMain);	
		RedSteelHelmet = new ArmorRedSteel(ARedSteel, RedSteelHelmetID, 0).setCreativeTab(TabMain).setUnlocalizedName("RedSteelHelmet");
		RedSteelPlate  = new ArmorRedSteel(ARedSteel, RedSteelPlateID, 1).setCreativeTab(TabMain).setUnlocalizedName("RedSteelPlate");
		RedSteelLeggings = new ArmorRedSteel(ARedSteel, RedSteelLeggingsID, 2).setCreativeTab(TabMain).setUnlocalizedName("RedSteelLeggings");
		RedSteelBoots = new ArmorRedSteel(ARedSteel, RedSteelBootsID, 3).setCreativeTab(TabMain).setUnlocalizedName("RedSteelBoots");	
		RedSteelHelmetClassic = new ArmorRedSteelClassic(ARedSteel, RedSteelHelmetClassicID, 0).setUnlocalizedName("RedSteelHelmetClassic").setCreativeTab(TabMain);
		RedSteelPlateClassic = new ArmorRedSteelClassic(ARedSteel, RedSteelPlateClassicID, 1).setUnlocalizedName("RedSteelPlateClassic").setCreativeTab(TabMain);
		RedSteelLeggingsClassic = new ArmorRedSteelClassic(ARedSteel, RedSteelLeggingsClassicID, 2).setUnlocalizedName("RedSteelLeggingsClassic").setCreativeTab(TabMain);
		RedSteelBootsClassic = new ArmorRedSteelClassic(ARedSteel, RedSteelBootsClassicID, 3).setUnlocalizedName("RedSteelBootsClassic").setCreativeTab(TabMain);
		ManAtArmsHelmet = new ArmorManAtArms(ASteel, ManAtArmsHelmetID, 0).setCreativeTab(TabMain).setUnlocalizedName("ManAtArmsHelmet");
		
	}
	public static void register(){
		ri(BronzeHelmet);
		ri(BronzePlate);
		ri(BronzeLeggings);
		ri(BronzeBoots);
		ri(SteelHelmet);
		ri(SteelPlate);
		ri(SteelLeggings);
		ri(SteelBoots);
		ri(RedSteelHelmet);
		ri(RedSteelPlate);
		ri(RedSteelLeggings);
		ri(RedSteelBoots);
		ri(SteelHelmetClassic);
		ri(SteelPlateClassic);
		ri(SteelLeggingsClassic);
		ri(SteelBootsClassic);
		ri(RedSteelHelmetClassic);
		ri(RedSteelPlateClassic);
		ri(RedSteelLeggingsClassic);
		ri(RedSteelBootsClassic);
		ri(ManAtArmsHelmet);

	}
	public static void ri(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}

}
