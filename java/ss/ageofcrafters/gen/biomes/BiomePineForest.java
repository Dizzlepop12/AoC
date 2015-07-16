package ss.ageofcrafters.gen.biomes;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import ss.ageofcrafters.gen.WorldGenBigPineTree;
import ss.ageofcrafters.gen.WorldGenPineTree;
import ss.ageofcrafters.gen.WorldGenPineTree2;

public class BiomePineForest extends BiomeGenBase {

    private static final WorldGenPineTree pinetree = new WorldGenPineTree();
	
	
	public static final Height biomeHeight = new Height(0.2f, 0.5f);


	public static final WorldGenPineTree2 conepinetree = new WorldGenPineTree2();


	public static final WorldGenBigPineTree bigpinetree = new WorldGenBigPineTree();

	public BiomePineForest(int id) {
		super(id);
		this.setColor(14663748);
		this.setBiomeName("Pinnacea Forest");
		this.setHeight(biomeHeight );
		this.waterColorMultiplier = 2373278;
		this.spawnableWaterCreatureList.clear();
		this.theBiomeDecorator.generateLakes = true;
		this.theBiomeDecorator.flowersPerChunk = 4;
        this.theBiomeDecorator.grassPerChunk = 32;
        this.theBiomeDecorator.treesPerChunk = 8;
	}

	public int getBiomeGrassColor(int x, int y, int z){
		return 7589458;
	}
	
	public int getBiomeFoliageColor(int x, int y, int z){
		return 7187779;
	}
	public int getSkyColorByTemp(float par1){
		return 5426884;
		
	}
	/**The method for generating trees. 
	 * @return @class WorldGenAbstractTree Tree to generate
	 * 
	 **/
    public WorldGenAbstractTree func_150567_a(Random random)
    {
         if(0 + random.nextInt(100) >= 50 && 0+ random.nextInt(100) > 20){
        	return conepinetree;
        }if(0 + random.nextInt(100) >= 10){
        	return bigpinetree;
        }else{
        	return pinetree;
        }
    }
}
