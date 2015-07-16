package ss.ageofcrafters.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenJungle;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class AgeOfCraftersGenerator implements IWorldGenerator {
 
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		if(world.provider.dimensionId == 0){
			//Surface
			generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		if(world.provider.dimensionId == -1){
			//Nether
			generateNether(world, random, chunkX*16, chunkZ*16);
		}
		if(world.provider.dimensionId == 1){
			//End
			generateEnd(world, random, chunkX*16, chunkZ*16);

		}else{
			//Surface, 2
			generateSurface(world, random, chunkX*16, chunkZ*16);
		}

	}

	public void generateSurface(World world, Random random, int x, int z) 
	{
		this.addOreSpawn(AgeOfCraftersBlocks.CopperOre, world, random, x, z, 16, 16, 4 + random.nextInt(4), 35, 1, 54);
		this.addOreSpawn(AgeOfCraftersBlocks.TinOre, world, random, x, z, 16, 16, 4 + random.nextInt(2), 25, 1, 44);

		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z); 

		if(biome instanceof BiomeGenJungle){
			this.addOreSpawn(AgeOfCraftersBlocks.JadeOre,world, random, x, z, 16, 16, 4+random.nextInt(4), 20, 1, 50);
		}

		for(int a = 0; a < 1; a++){
			int i = x + random.nextInt(256);
			int j = z + random.nextInt(256);
			int k = world.getHeightValue(i, j);


		}
	}
	public void addOreSpawn(Block block,World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++){
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY- minY);
		    int posZ = blockZPos + random.nextInt(maxZ);
		    (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}

	private void generateNether(World world, Random random, int x, int z) {

	}
	private void generateEnd(World world, Random random, int x, int z) {
		
	}

	

	
}
