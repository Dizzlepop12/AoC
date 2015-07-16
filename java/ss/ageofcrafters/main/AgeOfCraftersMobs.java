/**
 * This file is a part of AGE OF CRAFTERS. If you're using a portion of code or code edited using this file's code as base, you
 * must mention that in the site you're uploading your mod, or in the mcmod.info credits.
 * CODED & TEXTURED BY QUACKIE_THE_DUCK and SSILVAMC
 * CONTENT IDEAS BY SSILVAMC, QUACKIE_THE_DUCK, KOOKYBOY9 and SO MUCH MORE
 * IDEAS from WIKIPEDIA.ORG, BEN-HUR: A TALE OF CHRIST, AGE OF EMPIRES SERIES by MICROSOFT CORPORATION
 * 
 */
package ss.ageofcrafters.main;

import ss.ageofcrafters.units.EntityBowman;
import ss.ageofcrafters.units.EntityClubman;
import ss.ageofcrafters.units.EntityWarrior;
import cpw.mods.fml.common.registry.EntityRegistry;

public class AgeOfCraftersMobs {

	
	public static void register() {
		EntityRegistry.registerModEntity(EntityClubman.class, "Clubman", 125, AgeOfCrafters.instance, 24, 4, false);
		EntityRegistry.registerModEntity(EntityBowman.class, "Bowman", 126, AgeOfCrafters.instance, 24, 4, false);
		EntityRegistry.registerModEntity(EntityWarrior.class, "Warrior", 127, AgeOfCrafters.instance, 24, 4, false);

	}

}
