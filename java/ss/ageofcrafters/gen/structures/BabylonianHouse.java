//Schematic to java Structure by jajo_11 | inspired by "MITHION'S .SCHEMATIC TO JAVA CONVERTINGTOOL"

package ss.ageofcrafters.gen.structures;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;

public class BabylonianHouse extends WorldGenerator
{
	protected Block[] GetValidSpawnBlocks()
	{
		return new Block[]
		{
			Blocks.grass,
			Blocks.dirt,
		};
	}

	public boolean LocationIsValidSpawn(World world, int x, int y, int z){
		
		Block block = world.getBlock(x, y, z);
		Block checkBlock = world.getBlock(x, y - 1, z);
		Block blockAbove = world.getBlock(x, y , z);
		Block blockBelow = world.getBlock(x, y - 2, z);

		for (Block i : GetValidSpawnBlocks())
		{
			if (blockAbove != Blocks.air)
			{
				return false;
			}
			if (block == i)
			{
				return true;
			}
			else if (block == Blocks.snow_layer && blockBelow == i)
			{
				return true;
			}
			else if (block.getMaterial() == Material.plants && blockBelow == i)
			{
				return true;
			}
		}
		return false;
	}

	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		int i = rand.nextInt(4);

		if(i == 0)
		{
		    generate_r0(world, rand, x, y, z);
		}

		if(i == 1)
		{
		    generate_r1(world, rand, x, y, z);
		}

		if(i == 2)
		{
		    generate_r2(world, rand, x, y, z);
		}

		if(i == 3)
		{
		    generate_r3(world, rand, x, y, z);
		}

       return true;

	}

	public boolean generate_r0(World world, Random rand, int x, int y, int z)
	{
		if
		(
		    !LocationIsValidSpawn(world, x + 0, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +7)
       )

		world.setBlock(x + 0, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 2, Blocks.flower_pot, 1, 3);
		world.setBlock(x + 0, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 3, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 3, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 3, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 3, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 3, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 4, z + 6, Blocks.hay_block, 0, 3);
		return true;

	}
	public boolean generate_r1(World world, Random rand, int x, int y, int z)
	{
		if
		(
		    !LocationIsValidSpawn(world, x + 0, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +0)
	    )

		world.setBlock(x + 0, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 2, Blocks.flower_pot, 1, 3);
		world.setBlock(x + 3, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 2, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 2, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 2, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 2, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 2, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 3, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 3, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 3, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 3, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 3, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 0, Blocks.hay_block, 0, 3);
		return true;

	}
	public boolean generate_r2(World world, Random rand, int x, int y, int z)
	{
		if
		(
		    !LocationIsValidSpawn(world, x + 0, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +7)
       )

		world.setBlock(x + 7, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 5, Blocks.flower_pot, 1, 3);
		world.setBlock(x + 7, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 3, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 3, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 3, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 3, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 3, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 3, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 4, z + 1, Blocks.hay_block, 0, 3);
		return true;

	}
	public boolean generate_r3(World world, Random rand, int x, int y, int z)
	{
		if
		(
		    !LocationIsValidSpawn(world, x + 0, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 3, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 4, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 5, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 6, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +7) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +6) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +5) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +4) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +3) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 7, y, z +0)
	    )

		world.setBlock(x + 7, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 0, z + 5, Blocks.flower_pot, 1, 3);
		world.setBlock(x + 4, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 0, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 6, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 5, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 1, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 2, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 1, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 7, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 7, y + 2, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 6, y + 2, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 5, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 2, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 3, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 4, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 5, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 6, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 4, y + 2, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 2, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 2, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 2, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 2, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 2, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 2, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 4, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 3, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 3, y + 3, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 3, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 2, y + 3, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 3, z + 0, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 1, y + 3, z + 7, AgeOfCraftersBlocks.DirtBricks, 6, 3);
		world.setBlock(x + 0, y + 3, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 0, y + 3, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 3, y + 4, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 2, y + 4, z + 7, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 0, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 1, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 2, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 3, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 4, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 5, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 6, Blocks.hay_block, 0, 3);
		world.setBlock(x + 1, y + 4, z + 7, Blocks.hay_block, 0, 3);
		return true;

	}
//bazinga
}