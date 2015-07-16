/**
 * This file is a part of AGE OF CRAFTERS. If you're using a portion of code or code edited using this file's code as base, you
 * must mention that in the site you're uploading your mod, or in the mcmod.info credits.
 * CODED & TEXTURED BY QUACKIE_THE_DUCK and SSILVAMC
 * CONTENT IDEAS BY SSILVAMC, QUACKIE_THE_DUCK, KOOKYBOY9 and SO MUCH MORE
 * IDEAS from WIKIPEDIA.ORG, BEN-HUR: A TALE OF CHRIST, AGE OF EMPIRES SERIES by MICROSOFT CORPORATION
 * 
 */
package ss.ageofcrafters.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class AgeOfCraftersCraftingsSmeltings {
	
	public static void init(){
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.JadeBrickStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.JadeBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ZigguratBrickStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.ZigguratBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SmoothstoneStairs, 2), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.SmoothstoneBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.DirtBrickStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.DirtBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SnowBrickStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.SnowBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.LapisBrickStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.LapisBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.EnderBrickStairs , 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.EnderBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SandstoneBrickStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.SandstoneBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ObsidianBrickStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.ObsidianBricks)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.AncientBrickStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.AncientBricks)});	

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ObsidianPillar, 3), new Object[] {
			"A", "A", "A", 'A', new ItemStack(AgeOfCraftersBlocks.ObsidianBricks)});
	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.LapisPillar, 3), new Object[] {
			"A", "A", "A",'A', new ItemStack(AgeOfCraftersBlocks.LapisBricks)});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SmoothstonePillar, 3), new Object[] {
			"A", "A","A", 'A', new ItemStack(AgeOfCraftersBlocks.SmoothstoneBricks)});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.JadePillar, 3), new Object[] {
			"A", "A","A", 'A', new ItemStack(AgeOfCraftersBlocks.JadeBricks)});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.DirtPillar, 3), new Object[] {
			"A", "A", "A",'A', new ItemStack(AgeOfCraftersBlocks.DirtBricks)});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.OldStonePillar, 3), new Object[] {
			"A", "A", "A", 'A', new ItemStack(AgeOfCraftersBlocks.AncientBricks)});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SandstonePillar, 3), new Object[] {
			"A", "A", "A",'A', new ItemStack(AgeOfCraftersBlocks.SandstoneBricks)});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SnowPillar, 3), new Object[] {
			"A", "A", "A",'A', new ItemStack(AgeOfCraftersBlocks.SnowBricks)});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ZigguratPillar, 3), new Object[] {
			"A", "A","A", 'A', new ItemStack(AgeOfCraftersBlocks.ZigguratBricks)});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.StonebrickPillar, 3), new Object[] {
			"A", "A","A", 'A', new ItemStack(Blocks.stonebrick, 1, 0)});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.EnderPillar, 3), new Object[] {
			"A", "A","A", 'A', new ItemStack(AgeOfCraftersBlocks.EnderBricks)});

		
		
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SandstoneBricks, 9), new Object[] {
			"AAA", "AAA", "AAA", 'A', Blocks.sandstone});
	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.EnderBricks, 4), new Object[] {
			"AA", "AA", 'A', Blocks.end_stone});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.LapisBricks, 4), new Object[] {
			"AA", "AA", 'A', Blocks.lapis_block});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ObsidianBricks, 4), new Object[] {
			"AA", "AA", 'A', Blocks.obsidian});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.QuartzBricks, 4), new Object[] {
			"AA", "AA", 'A', Blocks.quartz_block});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.AncientBricks, 4), new Object[] {
			"AB", "BA", 'A', Blocks.sand, 'B', Blocks.stonebrick});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.DirtBricks, 4), new Object[] {
			"AA", "AA", 'A', Blocks.dirt});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SmoothstoneBricks, 4), new Object[] {
			"AA", "AA", 'A', Blocks.double_stone_slab});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SnowBricks, 4), new Object[] {
			"AA", "AA", 'A', Blocks.snow});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ZigguratBricks, 4), new Object[] {
			"AA", "AA", 'A', AgeOfCraftersBlocks.DirtBricks});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.JadeBricks, 4), new Object[] {
			"AA", "AA", 'A', AgeOfCraftersBlocks.JadeOre});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.AlloyingTable, 1), new Object[] {
			"AAA", "ABA", "A A",'B', Items.coal, 'A', Items.iron_ingot});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersItems.GrapeSeeds, 4), new Object[] {
			"A",'A', AgeOfCraftersItems.Grape});
		
		/*
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.Crossbow), new Object[] {
			"CAB", " AA", "A C", 'A', Items.stick, 'B', Items.iron_ingot, 'C', Items.string});
		*/
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.AoCPlanks, 4), new Object[] {
			"A",'A', new ItemStack(AgeOfCraftersBlocks.AoCLog, 1)});

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.BronzeBlock, 1), new Object[] {
			"AAA","AAA","AAA",'A', AgeOfCraftersItems.BronzeIngot});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersItems.WineGoblet, 1), new Object[] {
			"C","B","A",'A', AgeOfCraftersItems.Goblet, 'B', Items.water_bucket, 'C', AgeOfCraftersItems.Grape});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersItems.Goblet, 2), new Object[] {
			"A","B",'A', Blocks.planks, 'B', Items.stick});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.BronzeSpade, 1), new Object[] {
			"A","B","B",'A', AgeOfCraftersItems.BronzeIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.BronzePickaxe, 1), new Object[] {
			"AAA"," B "," B ",'A', AgeOfCraftersItems.BronzeIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.BronzeAxe, 1), new Object[] {
			"AA","AB"," B",'A', AgeOfCraftersItems.BronzeIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.BronzeSword, 1), new Object[] {
			"A","A","B",'A', AgeOfCraftersItems.BronzeIngot, 'B', Items.stick});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.SilexSpade, 1), new Object[] {
			"A","B","B",'A', Items.flint, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.SilexPickaxe, 1), new Object[] {
			"AAA"," B "," B ",'A', Items.flint, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.SilexAxe, 1), new Object[] {
			"AA","AB"," B",'A', Items.flint, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.SilexSword, 1), new Object[] {
			"A","A","B",'A', Items.flint, 'B', Items.stick});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersItems.BronzeIngot, 9), new Object[] {
			"A", 'A', AgeOfCraftersBlocks.BronzeBlock});	

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SteelBlock, 1), new Object[] {
			"AAA","AAA","AAA",'A', AgeOfCraftersItems.SteelIngot});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.SteelSpade, 1), new Object[] {
			"A","B","B",'A', AgeOfCraftersItems.SteelIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.SteelPickaxe, 1), new Object[] {
			"AAA"," B "," B ",'A', AgeOfCraftersItems.SteelIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.SteelAxe, 1), new Object[] {
			"AA","AB"," B",'A', AgeOfCraftersItems.SteelIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.SteelSword, 1), new Object[] {
			"A","A","B",'A', AgeOfCraftersItems.SteelIngot, 'B', Items.stick});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersItems.RedSteelIngot, 9), new Object[] {
			"A", 'A', AgeOfCraftersBlocks.RedSteelBlock});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.RedSteelBlock, 1), new Object[] {
			"AAA","AAA","AAA",'A', AgeOfCraftersItems.RedSteelIngot});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.RedSteelSpade, 1), new Object[] {
			"A","B","B",'A', AgeOfCraftersItems.RedSteelIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.RedSteelPickaxe, 1), new Object[] {
			"AAA"," B "," B ",'A', AgeOfCraftersItems.RedSteelIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.RedSteelAxe, 1), new Object[] {
			"AA","AB"," B",'A', AgeOfCraftersItems.RedSteelIngot, 'B', Items.stick});	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersTools.RedSteelSword, 1), new Object[] {
			"A","A","B",'A', AgeOfCraftersItems.RedSteelIngot, 'B', Items.stick});	
	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.RedTiles, 8), new Object[] {
			"AAA","ABA","AAA", 'A', Blocks.brick_block, 'B', new ItemStack(Items.dye, 1, 1)});	
	
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.BlueTiles, 8), new Object[] {
			"AAA","ABA","AAA",'A', Blocks.brick_block, 'B', new ItemStack(Items.dye, 1, 4)});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.CyanTiles, 8), new Object[] {
			"AAA","ABA","AAA",'A', Blocks.brick_block, 'B', new ItemStack(Items.dye, 1, 6)});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.WhiteTiles, 8), new Object[] {
			"AAA","ABA","AAA",'A', Blocks.brick_block, 'B', new ItemStack(Items.dye, 1, 15)});
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersItems.RedSteelIngot, 9), new Object[] {
			"A", 'A', AgeOfCraftersBlocks.RedSteelBlock});	

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.BlueTileStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.BlueTiles)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.CyanTileStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.CyanTiles)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.WhiteTileStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.WhiteTiles)});	

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.RedTileStairs, 4), new Object[] {
			"  A"," AA","AAA",'A', new ItemStack(AgeOfCraftersBlocks.RedTiles)});	
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ObsidianHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.ObsidianBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.JadeHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.JadeBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ZigguratHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.ZigguratBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.AncientHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.AncientBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.DirtHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.DirtBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SnowHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.SnowBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SandstoneHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.SandstoneBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.EnderHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.EnderBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.LapisHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.LapisBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.QuartzHalfSlab, 6),
				createNewSlab(new ItemStack(AgeOfCraftersBlocks.QuartzBricks)));
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledAncientBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.AncientHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledJadeBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.JadeHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledDirtBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.DirtHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledSnowBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.SnowHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledZigguratBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.ZigguratHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledEnderBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.EnderHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledSandstoneBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.SandstoneHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledLapisBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.LapisHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledQuartzBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.QuartzHalfSlab)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ChiseledObsidianBricks, 1),
				createNewChisel(new ItemStack(AgeOfCraftersBlocks.ObsidianHalfSlab)));
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersArmor.BronzeHelmet, 1),
				createNewArmor(0, new ItemStack(AgeOfCraftersItems.BronzeIngot)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersArmor.BronzePlate, 1),
				createNewArmor(1, new ItemStack(AgeOfCraftersItems.BronzeIngot)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersArmor.BronzeLeggings, 1),
				createNewArmor(2, new ItemStack(AgeOfCraftersItems.BronzeIngot)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersArmor.BronzeBoots, 1),
				createNewArmor(3, new ItemStack(AgeOfCraftersItems.BronzeIngot)));

		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersArmor.SteelHelmet, 1),
				createNewArmor(0, new ItemStack(AgeOfCraftersItems.SteelIngot)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersArmor.SteelPlate, 1),
				createNewArmor(1, new ItemStack(AgeOfCraftersItems.SteelIngot)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersArmor.SteelLeggings, 1),
				createNewArmor(2, new ItemStack(AgeOfCraftersItems.SteelIngot)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersArmor.SteelBoots, 1),
				createNewArmor(3, new ItemStack(AgeOfCraftersItems.SteelIngot)));
		
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.AncientBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.AncientBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.JadeBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.JadeBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.DirtBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.DirtBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SnowBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.SnowBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ZigguratBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.ZigguratBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.EnderBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.EnderBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SandstoneBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.SandstoneBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.LapisBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.LapisBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.QuartzBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.QuartzBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.ObsidianBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.ObsidianBricks)));
		GameRegistry.addRecipe(new ItemStack(AgeOfCraftersBlocks.SmoothstoneBrickWall, 6),
				createNewWall(new ItemStack(AgeOfCraftersBlocks.SmoothstoneBricks)));
		
		GameRegistry.addSmelting(AgeOfCraftersBlocks.TinOre, new ItemStack(AgeOfCraftersItems.TinIngot, 1), 0.3F);
		GameRegistry.addSmelting(AgeOfCraftersBlocks.CopperOre, new ItemStack(AgeOfCraftersItems.CopperIngot, 1), 0.3F);

		
		
	}

	public static Object[] createNewSlab(ItemStack itemstack){
		return new Object[] {"AAA",'A', itemstack};
	}
	
	public static Object[] createNewChisel(ItemStack itemstack){
		return new Object[] {"A","A",'A', itemstack};
	}
	public static Object[] createNewTool(int type, ItemStack material){
		switch(type){
		case 0: //Sword
			return new Object[] {"A", "A", "B", 'A', material, 'B', new ItemStack(Items.stick)};
		case 1: //Shovel
			return new Object[] {"A", " B ", " B ", 'A', material, 'B', new ItemStack(Items.stick)};
		case 2: //Axe
			return new Object[] {"AA", "AB", " B", 'A', material, 'B', new ItemStack(Items.stick)};
		case 3: //Pickaxe
			return new Object[] {"AAA", " B ", " B ", 'A', material, 'B', new ItemStack(Items.stick)};
		}
		return null;
	
	}
	
	public static Object[] createNewArmor(int type, ItemStack material){
		switch(type){
		case 0: //Helmet
			return new Object[] {"AAA", "A A", 'A', material};
		case 1: //Chest plate
			return new Object[] {"A A", "AAA", "AAA", 'A', material};
		case 2: //Legs
			return new Object[] {"AAA", "A A", "A A", 'A', material};
		case 3: //Bootyyyyy
			return new Object[] {"A A", "A A", 'A', material};
		}
		return null;
	
	}
	public static Object[] createNewWall(ItemStack material){
		return new Object[] {"AAA","AAA",'A', material};
	}
}
