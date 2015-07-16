/**
 * This file is a part of AGE OF CRAFTERS. If you're using a portion of code or code edited using this file's code as base, you
 * must mention that in the site you're uploading your mod, or in the mcmod.info credits.
 * CODED & TEXTURED BY QUACKIE_THE_DUCK and SSILVAMC
 * CONTENT IDEAS BY SSILVAMC, QUACKIE_THE_DUCK, KOOKYBOY9 and SO MUCH MORE
 * IDEAS from WIKIPEDIA.ORG, BEN-HUR: A TALE OF CHRIST, AGE OF EMPIRES SERIES by MICROSOFT CORPORATION
 * 
 */
package ss.ageofcrafters.main;

import ss.ageofcrafters.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AgeOfCrafters.modid, version = AgeOfCrafters.version, name = "Age Of Crafters")
public class AgeOfCrafters {

	public static final String modid = "aob";
	public static final String version = "1.5";
	
	@Instance(modid)
	public static AgeOfCrafters instance;
	
	@SidedProxy(clientSide = "ss.ageofcrafters.proxy.ClientProxy", serverSide = "ss.ageofcrafters.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static final int guiIdDesigner = 0;
	public static final int guiIdAlloyingTable = 1;
	public static final int guiIdAltar = 2;

	public static final CreativeTabs TabMain = new AgeOfCraftersTabMain(CreativeTabs.getNextID(), "AgeOfCraftersMainTab");
	public static final CreativeTabs TabSpawners = new AgeOfCraftersTabSpawners(CreativeTabs.getNextID(), "AgeOfCraftersSpawnersTab");

	@EventHandler
	public void pre(FMLPreInitializationEvent preEvent) {

		proxy.registerRenderers();
		proxy.registerEntityRenderers();
		
		}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		AgeOfCraftersBlocks.init();
		AgeOfCraftersBlocks.register();
		AgeOfCraftersTools.init();
		AgeOfCraftersTools.register();
		AgeOfCraftersSpawners.init();
		AgeOfCraftersSpawners.register();
		AgeOfCraftersArmor.init();
		AgeOfCraftersArmor.register();
		AgeOfCraftersItems.init();
		AgeOfCraftersItems.register();
		AgeOfCraftersCraftingsSmeltings.init();
		AgeOfCraftersRegistries.register();
		AgeOfCraftersBiomes.register();
		AgeOfCraftersMobs.register();


		proxy.bindItemRenderers();
	}
}