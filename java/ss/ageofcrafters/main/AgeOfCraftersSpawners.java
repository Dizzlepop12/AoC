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
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import ss.ageofcrafters.units.spawners.ItemBowmanSpawner;
import ss.ageofcrafters.units.spawners.ItemClubmanSpawner;
import ss.ageofcrafters.units.spawners.ItemSpawnWarrior;
import cpw.mods.fml.common.registry.GameRegistry;

public class AgeOfCraftersSpawners {


	public static Item SpawnClubman;
	public static Item SpawnBowman;
	public static Item SpawnWarrior;


	public static CreativeTabs TabMain = AgeOfCrafters.TabMain;
	public static CreativeTabs TabSpawners = AgeOfCrafters.TabSpawners;
	
	public static void init() {
		SpawnClubman = new ItemClubmanSpawner().setUnlocalizedName("AoCSpawners-clubman").setCreativeTab(TabSpawners);
		SpawnBowman = new ItemBowmanSpawner().setUnlocalizedName("AoCSpawners-bowman").setCreativeTab(TabSpawners);
		SpawnWarrior = new ItemSpawnWarrior().setUnlocalizedName("AoCSpawners-warrior").setCreativeTab(TabSpawners);
	}

	public static void register() {
		ri(SpawnClubman);
		ri(SpawnBowman);
		ri(SpawnWarrior);
	}

	public static void ri(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}

}
