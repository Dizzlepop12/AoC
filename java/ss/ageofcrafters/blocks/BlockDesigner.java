package ss.ageofcrafters.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import ss.ageofcrafters.blocks.tileentities.TileEntityDesigner;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDesigner extends BlockContainer{
	
	private Random rand;
	private final boolean isActive;
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	private static boolean keepInventory = true;
	
	private static int tick;
	
	public BlockDesigner(Material mat, boolean blockState) {
		super(mat);
		rand = new Random();
		isActive = blockState;
		tick = 1;
	}
	
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5) + "_side");
		this.topIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5) + "_top");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2) {
		return new TileEntityDesigner();
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		if(side == 0 && meta == 0|| side == 1 && meta == 0){
			return this.topIcon;
		}
		return this.blockIcon;
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		if(world.isRemote) {
			return true;
		}else if (!player.isSneaking()) {
			TileEntityDesigner entity = (TileEntityDesigner) world.getTileEntity(x, y, z);
			if (entity != null){
				FMLNetworkHandler.openGui(player, AgeOfCrafters.modid, AgeOfCrafters.guiIdDesigner, world, x, y, z);
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
				worldObj.setBlock(xCoord, yCoord,zCoord, AgeOfCraftersBlocks.WorkingDesigner);
			}else{
				worldObj.setBlock(xCoord, yCoord,zCoord, AgeOfCraftersBlocks.Designer);
			}
			keepInventory = false;
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);
		
			if(entity != null){
				entity.validate();
				worldObj.setTileEntity(xCoord, yCoord, zCoord, entity);
		}
	}
}
