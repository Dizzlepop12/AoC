/**
 * This file is a part of AGE OF CRAFTERS. If you're using a portion of code or code edited using this file's code as base, you
 * must mention that in the site you're uploading your mod, or in the mcmod.info credits.
 * CODED & TEXTURED BY QUACKIE_THE_DUCK and SSILVAMC
 * CONTENT IDEAS BY SSILVAMC, QUACKIE_THE_DUCK, KOOKYBOY9 and SO MUCH MORE
 * IDEAS from WIKIPEDIA.ORG, BEN-HUR: A TALE OF CHRIST, AGE OF EMPIRES SERIES by MICROSOFT CORPORATION
 * 
 */
package ss.ageofcrafters.main;

import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import ss.ageofcrafters.blocks.tileentities.TileEntityAlloyingTable;
import ss.ageofcrafters.blocks.tileentities.TileEntityAltar;
import ss.ageofcrafters.blocks.tileentities.TileEntityAmphora;
import ss.ageofcrafters.blocks.tileentities.TileEntityCrater;
import ss.ageofcrafters.blocks.tileentities.TileEntityDesigner;
import ss.ageofcrafters.blocks.tileentities.TileEntityGoblet;
import ss.ageofcrafters.blocks.tileentities.TileEntityWineGoblet;
import ss.ageofcrafters.gen.AgeOfCraftersGenerator;
import ss.ageofcrafters.gui.GuiHandler;
import ss.ageofcrafters.render.RenderHopliteSpear;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class AgeOfCraftersRegistries {
	
	public  static IWorldGenerator eventWorldGen = new AgeOfCraftersGenerator();
	public static BiomeGenBase PineForest;

	public static void register(){
		GameRegistry.registerTileEntity(TileEntityDesigner.class, "Designer");
		GameRegistry.registerTileEntity(TileEntityAlloyingTable.class, "AlloyingTable");
		GameRegistry.registerTileEntity(TileEntityGoblet.class, "Goblet");
		GameRegistry.registerTileEntity(TileEntityWineGoblet.class, "WineGoblet");
		GameRegistry.registerTileEntity(TileEntityAltar.class, "Altar");
	   GameRegistry.registerWorldGenerator(new AgeOfCraftersGenerator(), 0);

		OreDictionary.registerOre(AgeOfCraftersBlocks.CopperOre.getUnlocalizedName().substring(5), AgeOfCraftersBlocks.CopperOre);
		OreDictionary.registerOre(AgeOfCraftersBlocks.TinOre.getUnlocalizedName().substring(5), AgeOfCraftersBlocks.TinOre);

		NetworkRegistry.INSTANCE.registerGuiHandler(AgeOfCrafters.modid, new GuiHandler());
		MinecraftForge.addGrassSeed(new ItemStack(AgeOfCraftersItems.GrapeSeeds), 5);
		

	}

}
