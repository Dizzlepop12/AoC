package ss.ageofcrafters.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;

public class WorldGenOliveTree extends WorldGenAbstractTree{

	public WorldGenOliveTree(Block wood, Block leaves, int metaWood, int metaLeaves, boolean doBlockNotify, int minTreeHeight, int randomTreeHeight, boolean vinesGrow) {
		super(false);
	}

	/**
	 * Simple constructor for the WorldGenOliveTree class. 
	 **/
	public WorldGenOliveTree() {
		super(false);
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		while (world.isAirBlock(x, y, z)) {
			y--; 
		}
		
		Block block = world.getBlock(x, y, z);
		
		if(block != Blocks.grass && block != Blocks.dirt) {
			return false;
		}else{
			for(int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if(world.isAirBlock(x + i, y - 1, z + j) && world.isAirBlock(x + i, y -2,z + j)&& !world.isAirBlock(x + i, y, z + j)){
						return false;
					}
				}
			}
			
			int baselength = 0+ random.nextInt(2);
			int branches = 8;
			
			int h= 1;
			
			block.onPlantGrow(world, x, y - 1, z, x, y, z);
			
			for(int i = 0; i < baselength; i++) {
				buildBlock(world, x, y + h, z, AgeOfCraftersBlocks.AoCLog, 1);
				h++;
			}
			
			int c = 1;
			for(int i = 0; i < branches; i++) {
				generateBranch(world, random, x, y + h, z, c);
				//c++;
				//h+=2;
				;	
			}
			
			generateTop(world, x, y + h, z);
			return true;
			}
		}
	
	
	public void generateBranch(World world, Random random, int x, int y, int z, int p){

    	
    }
    public void generateTop(World world, int x, int y, int z){

    	Block log = AgeOfCraftersBlocks.AoCLog;
    	Block leaves = AgeOfCraftersBlocks.OliveLeaves;
    	
    	
    	buildBlock(world, x, y, z, log , 1);
    	buildBlock(world, x, y + 1, z, log, 1);
    	buildBlock(world, x, y + 2, z, log, 1);
    	buildBlock(world, x, y + 3, z, log, 1);

    	
    	
    	buildBlock(world, x + 1, y + 2, z, leaves , 0);
    	buildBlock(world, x + 2, y + 2, z, leaves , 0);
    	buildBlock(world, x - 1, y + 2, z, leaves , 0);
    	buildBlock(world, x - 2, y + 2, z, leaves , 0);
    	
    	buildBlock(world, x + 1, y + 2, z + 1, leaves , 0);
    	buildBlock(world, x - 1, y + 2, z + 1, leaves , 0);
    	buildBlock(world, x - 1, y + 2, z - 1, leaves , 0);
    	buildBlock(world, x + 1, y + 2, z - 1, leaves , 0);
    	
    	buildBlock(world, x + 2, y + 2, z, leaves , 0);
    	buildBlock(world, x + 2, y + 2, z - 1, leaves , 0);
    	buildBlock(world, x + 2, y + 2, z - 2, leaves , 0);
    	buildBlock(world, x + 2, y + 2, z + 1, leaves , 0);
    	buildBlock(world, x + 2, y + 2, z + 2, leaves , 0);
    	
    	buildBlock(world, x - 2, y + 2, z, leaves , 0);
    	buildBlock(world, x - 2, y + 2, z - 1, leaves , 0);
    	buildBlock(world, x - 2, y + 2, z - 2, leaves , 0);
    	buildBlock(world, x - 2, y + 2, z + 1, leaves , 0);
    	buildBlock(world, x - 2, y + 2, z + 2, leaves , 0);
    	
    	buildBlock(world, x, y + 2, z, leaves , 0);
    	
    	buildBlock(world, x + 1, y + 3, z, leaves , 0);
    	buildBlock(world, x - 1, y + 3, z, leaves , 0);
    	buildBlock(world, x, y + 3, z + 1, leaves , 0);
    	buildBlock(world, x, y + 3, z - 1, leaves , 0);
    	buildBlock(world, x + 1, y + 3, z + 1, leaves , 0);
    	buildBlock(world, x + 1, y + 3, z - 1, leaves , 0);
    	buildBlock(world, x - 1, y + 3, z + 1, leaves , 0);
    	buildBlock(world, x - 1, y + 3, z - 1, leaves , 0);
    	
    	
    	buildBlock(world, x, y + 4, z, leaves , 0);
    	buildBlock(world, x + 1, y + 4, z, leaves , 0);
    	buildBlock(world, x - 1, y + 4, z, leaves , 0);
    	buildBlock(world, x, y + 4, z + 1, leaves , 0);
    	buildBlock(world, x, y + 4, z - 1, leaves , 0);

    	
    	
    	
    	buildBlock(world, x, y + 2, z + 1, leaves , 0);
    	buildBlock(world, x, y + 2, z + 2, leaves , 0);
    	buildBlock(world, x, y + 2, z - 1, leaves , 0);
    	buildBlock(world, x, y + 2, z - 2, leaves , 0);

    	buildBlock(world, x + 1, y + 2, z - 1, leaves , 0);
    	buildBlock(world, x - 1, y + 2, z - 2, leaves , 0);
    	buildBlock(world, x - 1, y + 2, z + 1, leaves , 0);
    	buildBlock(world, x + 1, y + 2, z + 2, leaves , 0);
    	buildBlock(world, x - 1, y + 2, z + 2, leaves , 0);
    	buildBlock(world, x + 1, y + 2, z - 2, leaves , 0);

    	

    }
    
    public void buildBlock(World world, int x, int y, int z, Block block, int meta) {
    	if (world.isAirBlock(x, y, z) || world.getBlock(x, y, z).isLeaves(world, x, y, z)) {
    		world.setBlock(x, y, z, block, meta, 2);
    	}
    
    	}

}
