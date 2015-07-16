package ss.ageofcrafters.blocks.slabs;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import ss.ageofcrafters.main.AgeOfCraftersItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAncientSlab extends BlockSlab
{
	public static final String[] slabType = { "ancient" };
	private IIcon topTexture;

	public BlockAncientSlab(boolean isDouble, Material mat)
	{
		super(isDouble, mat);
		useNeighborBrightness = true;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + "AoCSlabs-" + "ancient");
		this.topTexture = reg.registerIcon(AgeOfCrafters.modid + ":" + "AoBBricks." + "ancient");
		
		}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		if(side == 0 || side == 1){
			return this.topTexture;
		}
		
		return this.blockIcon;
	}

	public Item getItemDropped(int side, Random rand, int meta)
	{
		return Item.getItemFromBlock(AgeOfCraftersBlocks.AncientHalfSlab);
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
	{
		if(par1World.getBlock(par2, par3 - 1, par4) == AgeOfCraftersBlocks.AncientHalfSlab)
		{
			par1World.setBlock(par2, par3 - 1, par4, AgeOfCraftersBlocks.AncientDoubleSlab);
		}
		if(par1World.getBlock(par2, par3 + 1, par4) == AgeOfCraftersBlocks.AncientHalfSlab)
		{
			par1World.setBlock(par2, par3 + 1, par4, AgeOfCraftersBlocks.AncientDoubleSlab);
		}
	}
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs par2CreativeTabs, List par3List)
	{
		if (block != Item.getItemFromBlock(AgeOfCraftersBlocks.AncientDoubleSlab))
		{
			par3List.add(new ItemStack(block, 1, 0));
		}
	}
	
	protected ItemStack createStackedBlock(int par1)
	{
		return new ItemStack(AgeOfCraftersBlocks.AncientHalfSlab, 2, par1 & 7);
	}


	public String getFullSlabName(int par1)
	{
		if ((par1 < 0) || (par1 >= slabType.length))
		{
			par1 = 0;
		}

		return getUnlocalizedName();
	}
	
	
	
	@Override
	public String func_150002_b(int arg1) {
		return getFullSlabName(arg1);
	}
	
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int x, int y, int z)
	{
		return Item.getItemFromBlock(AgeOfCraftersBlocks.AncientHalfSlab);
	}
	
	
}