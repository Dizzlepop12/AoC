package ss.ageofcrafters.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;

public class WorldGenBigPineTree extends WorldGenAbstractTree{

	public WorldGenBigPineTree(Block wood, Block leaves, int metaWood, int metaLeaves, boolean doBlockNotify, int minTreeHeight, int randomTreeHeight, boolean vinesGrow) {
		super(false);
	}

	/**
	 * Simple constructor for the WorldGenPineTree class. 
	 **/
	public WorldGenBigPineTree() {
		super(false);
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		while (world.isAirBlock(x, y, z)) {
			y--; 
		}
		
		Block block = world.getBlock(x, y, z);
		Block block1 = world.getBlock(x + 1, y, z);
		Block block2 = world.getBlock(x, y, z + 1);
		Block block3 = world.getBlock(x + 1, y, z + 1);
		Block block4 = world.getBlock(x - 1, y, z);
		Block block5 = world.getBlock(x, y, z - 1);
		Block block6 = world.getBlock(x - 1, y, z - 1);
		Block block7 = world.getBlock(x - 1, y, z + 1);
		Block block8 = world.getBlock(x + 1, y, z - 1);



		
		if(block != Blocks.grass && block != Blocks.dirt && block1 != Blocks.grass && block1 != Blocks.dirt && block2 != Blocks.grass && block2 != Blocks.dirt && block3 != Blocks.grass && block3 != Blocks.dirt /*CHANGE*/
				 || block != Blocks.grass && block != Blocks.dirt && block4 != Blocks.grass && block4 != Blocks.dirt && block5 != Blocks.grass && block5 != Blocks.dirt && block6 != Blocks.grass && block6 != Blocks.dirt ||
				 block != Blocks.grass && block != Blocks.dirt && block1 != Blocks.grass && block1 != Blocks.dirt && block8 != Blocks.grass && block8 != Blocks.dirt && block5 != Blocks.grass && block5 != Blocks.dirt ||
				 block != Blocks.grass && block != Blocks.dirt && block4 != Blocks.grass && block4 != Blocks.dirt && block6 != Blocks.grass && block6 != Blocks.dirt && block5 != Blocks.grass && block5 != Blocks.dirt) {
			return false;
		}else{
			for(int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if(world.isAirBlock(x + i, y - 1, z + j) && world.isAirBlock(x + i, y -2,z + j)&& !world.isAirBlock(x + i, y, z + j)){
						return false;
					}
				}
			}
			
			int baselength = 0;
			int branches = 8 ;
			
			int h= 1;
			
			block.onPlantGrow(world, x, y - 1, z, x, y, z);
			
			for(int i = 0; i < baselength; i++) {
				buildBlock(world, x, y + h, z, AgeOfCraftersBlocks.AoCLog, 0);
				buildBlock(world, x + 1, y + h, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
				buildBlock(world, x, y + h, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
				buildBlock(world, x + 1, y + h, z, AgeOfCraftersBlocks.AoCLog, 0);
				h++;
			}
			
			int c = 1;
			for(int i = 0; i < branches; i++) {
				generateBranch(world, random, x, y + h, z, c);
	
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
    	Block leaves = AgeOfCraftersBlocks.PineLeaves;
    	
		buildBlock(world,x, y + 0, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 0, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 0, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 0, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 1, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 1, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 1, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 1, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 2, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 2, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 2, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 2, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 3, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 3, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 3, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 3, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 4, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 4, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 4, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 4, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 5, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 5, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 5, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 5, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 6, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 6, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 6, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 6, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 7, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 7, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 7, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 7, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 8, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 8, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 8, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 8, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 9, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 9, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 9, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 9, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 10, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 10, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 10, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 10, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 11, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 11, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 11, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 11, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 12, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 12, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 12, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 12, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x - 0, y + 13, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 13, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 13, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 13, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 13, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 13, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 13, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 13, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 13, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 13, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 13, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 13, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 14, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 14, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 14, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 14, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 14, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 14, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 14, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 14, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 14, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 14, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 14, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 14, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 14, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 14, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 14, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 14, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 15, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 15, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 15, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 15, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 15, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 15, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 15, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 15, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 15, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 15, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 15, z - 0, AgeOfCraftersBlocks.PineLeaves, 8);
		buildBlock(world,x - 1, y + 15, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 15, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 15, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 15, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 15, z - 0, AgeOfCraftersBlocks.PineLeaves, 8);
		buildBlock(world,x + 0, y + 15, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 15, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 15, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 15, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 15, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 15, z + 1, AgeOfCraftersBlocks.PineLeaves, 8);
		buildBlock(world,x + 0, y + 15, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 15, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 15, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 15, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 15, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 15, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 15, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 15, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 15, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 15, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 16, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 16, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 16, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 16, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 16, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 16, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 16, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 16, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 16, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 16, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 16, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 16, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 16, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 16, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 16, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 16, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 16, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 16, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 16, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 16, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 16, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 16, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 16, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 16, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 16, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 16, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 16, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 16, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 16, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 16, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 16, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 16, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 17, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 17, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 17, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 17, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 17, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 17, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 17, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 17, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 17, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 17, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 17, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 17, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 17, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 17, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 17, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 17, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 17, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 17, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 17, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 17, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 17, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 17, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 17, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 17, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 17, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 17, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 17, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 17, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 17, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 17, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 17, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 17, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 18, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 18, z + 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 18, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 18, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 18, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 18, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 18, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 18, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 18, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 18, z - 0, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 18, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 18, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 0, y + 18, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 18, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 18, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 1, y + 18, z + 1, AgeOfCraftersBlocks.AoCLog, 0);
		buildBlock(world,x + 2, y + 18, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 3, y + 18, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 18, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 18, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 18, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 18, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 18, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		
		buildBlock(world,x - 2, y + 18, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 17, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 16, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 15, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		
		buildBlock(world,x - 2, y + 18, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 17, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 16, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 15, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		
		buildBlock(world,x - 2, y + 17, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 16, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 15, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		
		buildBlock(world,x - 2, y + 17, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 16, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 2, y + 15, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		
		
		
		buildBlock(world,x - 0, y + 18, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 17, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 16, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 15, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		
		buildBlock(world,x + 1, y + 18, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 17, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 16, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 15, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		
		buildBlock(world,x + 2, y + 17, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 16, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 15, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		
		buildBlock(world,x + 2, y + 17, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 16, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 15, z - 2, AgeOfCraftersBlocks.PineLeaves, 0);

		buildBlock(world,x + 1, y + 18, z + 3, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 19, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 19, z - 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 19, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 19, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 19, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 19, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 1, y + 19, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 19, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 19, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 2, y + 19, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 19, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 19, z + 2, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 20, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 20, z - 0, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x - 0, y + 20, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
		buildBlock(world,x + 1, y + 20, z + 1, AgeOfCraftersBlocks.PineLeaves, 0);
	

    }
    
    public void buildBlock(World world, int x, int y, int z, Block block, int meta) {
    	if (world.isAirBlock(x, y, z) || world.getBlock(x, y, z).isLeaves(world, x, y, z)) {
    		world.setBlock(x, y, z, block, meta, 2);
    	}
    	
    
    	}
    
    	
    }

