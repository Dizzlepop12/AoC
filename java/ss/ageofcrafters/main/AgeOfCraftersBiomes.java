/**
 * This file is a part of AGE OF CRAFTERS. If you're using a portion of code or code edited using this file's code as base, you
 * must mention that in the site you're uploading your mod, or in the mcmod.info credits.
 * CODED & TEXTURED BY QUACKIE_THE_DUCK and SSILVAMC
 * CONTENT IDEAS BY SSILVAMC, QUACKIE_THE_DUCK, KOOKYBOY9 and SO MUCH MORE
 * IDEAS from WIKIPEDIA.ORG, BEN-HUR: A TALE OF CHRIST, AGE OF EMPIRES SERIES by MICROSOFT CORPORATION
 * 
 */
package ss.ageofcrafters.main;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import ss.ageofcrafters.gen.biomes.BiomePineForest;

public class AgeOfCraftersBiomes {

	public  static BiomeGenBase PineForest;

	
	public static void register() {
		PineForest = new BiomePineForest(51);
		BiomeManager.coolBiomes.add(new BiomeEntry(PineForest, 20));
		BiomeDictionary.registerBiomeType(PineForest, Type.FOREST);
		BiomeManager.addSpawnBiome(PineForest);		
	}

}
