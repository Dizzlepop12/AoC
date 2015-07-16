package ss.ageofcrafters.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import ss.ageofcrafters.blocks.tileentities.TileEntityAlloyingTable;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAlloyingTable extends BlockContainer {

	private Random rand;
	private final boolean isActive;
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	private static boolean keepInventory = true;
	
	public BlockAlloyingTable(Material material, boolean blockState) {
		super(material);
		rand = new Random();
		this.isActive = blockState;
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
		return new TileEntityAlloyingTable();
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		if(world.isRemote) {
			return true;
		}else if (!player.isSneaking()) {
			TileEntityAlloyingTable entity = (TileEntityAlloyingTable) world.getTileEntity(x, y, z);
			if (entity != null){
				FMLNetworkHandler.openGui(player, AgeOfCrafters.modid, AgeOfCrafters.guiIdAlloyingTable, world, x, y, z);
			}
			return true;
		}else{
			return false;
		}
		
	}

	public static void updateBlockState(boolean isCarving, World worldObj, int xCoord, int yCoord, int zCoord) {
			int i = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
				TileEntity entity = worldObj.getTileEntity(xCoord, yCoord, zCoord);
				keepInventory = true;
		
			if(isCarving) {
				worldObj.setBlock(xCoord, yCoord,zCoord, AgeOfCraftersBlocks.WorkingAlloyingTable);
			}else{
				worldObj.setBlock(xCoord, yCoord,zCoord, AgeOfCraftersBlocks.AlloyingTable);
			}
			keepInventory = false;
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);
		
			if(entity != null){
				entity.validate();
				worldObj.setTileEntity(xCoord, yCoord, zCoord, entity);
		}
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}

    
}
