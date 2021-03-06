package ss.ageofcrafters.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import ss.ageofcrafters.gen.WorldGenBigPineTree;
import ss.ageofcrafters.gen.WorldGenOliveTree;
import ss.ageofcrafters.gen.WorldGenPineTree2;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAoCSaplings extends BlockSapling{
	
	public static final String[] saplings = new String[] {"pine", "pine2", "olive" };
    private static final IIcon[] iconLength = new IIcon[saplings.length];	
    
	public BlockAoCSaplings(Material material){
		super();
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(CreativeTabs.tabDecorations);
	} 
	    public void updateTick(World world, int x, int y, int z, Random rand)
	    {
	        if (!world.isRemote)
	        {
	            super.updateTick(world, x, y, z, rand);

	            if (world.getBlockLightValue(x, y + 1, z) >= 9 && rand.nextInt(7) == 0)
	            {
	                this.func_149879_c(world, x, y, z, rand);
	            }
	        }
	    }

	    /**
	     * Gets the block's texture. Args: side, meta
	     */
	    @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int side, int meta)
	    {
	        meta &= 7;
	        return iconLength[MathHelper.clamp_int(meta, 0, 5)];
	    }

	    public void func_149879_c(World world, int x, int y, int z, Random rand)
	    {
	        int l = world.getBlockMetadata(x, y, z);

	        if ((l & 8) == 0)
	        {
	            world.setBlockMetadataWithNotify(x, y, z, l | 8, 4);
	        }
	        else
	        {
	            this.func_149878_d(world, x, y, z, rand);
	        }
	    }

	    public void func_149878_d(World world, int x, int y, int z, Random rand)
	    {
	        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, rand, x, y, z)) return;
	        int metadata = world.getBlockMetadata(x, y, z) & 7;
	        Object object = rand.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
	        int i1 = 0;
	        int j1 = 0;
	        boolean flag = false;

	        switch (metadata)
	        {
	            case 0:
	            	object = new WorldGenBigPineTree(AgeOfCraftersBlocks.AoCLog, AgeOfCraftersBlocks.PineLeaves, 0, 0, false, 4, 24, false);
	                break;
	            case 1:
	            	object = new WorldGenPineTree2(AgeOfCraftersBlocks.AoCLog, AgeOfCraftersBlocks.ConePineLeaves, 0, 0, false, 4 ,6, false);
	                break;
	            case 2:
	            	object = new WorldGenOliveTree(AgeOfCraftersBlocks.AoCLog, AgeOfCraftersBlocks.OliveLeaves, 0, 0, false, 4, 6, false);
	                break;
	            case 3:	 
	                break;
	            case 4:
	                break;
	            case 5:
	            	break;
	            default:
	            	break;
	               
	        }

	        Block block = Blocks.air;

	        if (flag)
	        {
	            world.setBlock(x + i1, y, z + j1, block, 0, 4);
	            world.setBlock(x + i1 + 1, y, z + j1, block, 0, 4);
	            world.setBlock(x + i1, y, z + j1 + 1, block, 0, 4);
	            world.setBlock(x + i1 + 1, y, z + j1 + 1, block, 0, 4);
	        }
	        else
	        {
	            world.setBlock(x, y, z, block, 0, 4);
	        }

	        if (!((WorldGenerator)object).generate(world, rand, x + i1, y, z + j1))
	        {
	            if (flag)
	            {
	                world.setBlock(x + i1, y, z + j1, this, metadata, 4);
	                world.setBlock(x + i1 + 1, y, z + j1, this, metadata, 4);
	                world.setBlock(x + i1, y, z + j1 + 1, this, metadata, 4);
	                world.setBlock(x + i1 + 1, y, z + j1 + 1, this, metadata, 4);
	            }
	            else
	            {
	                world.setBlock(x, y, z, this, metadata, 4);
	            }
	        }
	    }

	    public boolean func_149880_a(World world, int x, int y, int z, int par1)
	    {
	        return world.getBlock(x, y, z) == this && (world.getBlockMetadata(x, y, z) & 7) == par1;
	    }

	    /**
	     * Determines the damage on the item the block drops. Used in cloth and wood.
	     */
	    public int damageDropped(int meta)
	    {
	        return MathHelper.clamp_int(meta & 7, 0, 5);
	    }

	    /**
	     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	     */
	    @SideOnly(Side.CLIENT)
	    public void getSubBlocks(Item item, CreativeTabs ctabs, List list){
	    	for(int i = 0; i < saplings.length; i++) {
	    		list.add(new ItemStack(item, 1, i));
	    	}	
    	}

	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        for (int i = 0; i < iconLength.length; ++i)
	        {
	            iconLength[i] = iconRegister.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5) + "-" + saplings[i]);
	        }
	    }

	    public boolean func_149851_a(World world, int x, int y, int z, boolean p_149851_5_)
	    {
	        return true;
	    }

	    public boolean func_149852_a(World world, Random rand, int x, int y, int z)
	    {
	        return (double)world.rand.nextFloat() < 0.45D;
	    }

	    public void func_149853_b(World world, Random rand, int x, int y, int z)
	    {
	        this.func_149879_c(world, x, y, z, rand);
	    }
	}