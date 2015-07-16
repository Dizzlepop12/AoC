package ss.ageofcrafters.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ss.ageofcrafters.blocks.tileentities.TileEntityGoblet;
import ss.ageofcrafters.blocks.tileentities.TileEntityWineGoblet;
import ss.ageofcrafters.main.AgeOfCraftersItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWineGoblet extends BlockContainer{
	
	public BlockWineGoblet(Material material) {
		super(material);
		double fp1= Blocks.flower_pot.getBlockBoundsMinX();
		double fp2= Blocks.flower_pot.getBlockBoundsMinY();
		double fp3= Blocks.flower_pot.getBlockBoundsMinZ();
		double fp4= Blocks.flower_pot.getBlockBoundsMaxX();
		double fp5= Blocks.flower_pot.getBlockBoundsMaxY();
		double fp6= Blocks.flower_pot.getBlockBoundsMaxZ();
		this.setBlockBounds((float)fp1, (float)fp2, (float)fp3, (float)fp4, (float)fp5 + 0.2F, (float)fp6);
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	public boolean renderAsNormalBlock(){
		return false;
	}
	public int getRenderType(){
		return -1;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {

		return new TileEntityWineGoblet();
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon("minecraft:planks_oak");
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
			return AgeOfCraftersItems.WineGoblet;
	}	
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
			return AgeOfCraftersItems.WineGoblet;
	}
}
