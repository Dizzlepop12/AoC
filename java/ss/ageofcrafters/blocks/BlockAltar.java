package ss.ageofcrafters.blocks;

import java.beans.Expression;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import ss.ageofcrafters.blocks.tileentities.TileEntityAltar;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAltar extends BlockContainer {

	private final boolean isActive;
	
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	
	private static boolean keepInventory = true;
	public static Random random = new Random();

	public BlockAltar(Material material, boolean blockState) {
		super(material);
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
	public TileEntity createNewTileEntity(World world, int side) {
		return new TileEntityAltar();
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		if(world.isRemote) {
			return true;
		}else if (!player.isSneaking()) {
			TileEntityAltar entity = (TileEntityAltar) world.getTileEntity(x, y, z);
			if (entity != null){
				FMLNetworkHandler.openGui(player, AgeOfCrafters.modid, AgeOfCrafters.guiIdAltar, world, x, y, z);
				world.playSoundAtEntity((Entity)player, AgeOfCrafters.modid + ":" + "altar", 0.6f, 1.0f);

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
				worldObj.setBlock(xCoord, yCoord,zCoord, AgeOfCraftersBlocks.WorkingAltar);
			}else{
				worldObj.setBlock(xCoord, yCoord,zCoord, AgeOfCraftersBlocks.Altar);
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

    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        if (!keepInventory)
        {
            TileEntityAltar tileentityAltar = (TileEntityAltar)p_149749_1_.getTileEntity(p_149749_2_, p_149749_3_, p_149749_4_);

            if (tileentityAltar != null)
            {
                for (int i1 = 0; i1 < tileentityAltar.getSizeInventory(); ++i1)
                {
                    ItemStack itemstack = tileentityAltar.getStackInSlot(i1);

                    if (itemstack != null)
                    {
                        float f = this.random.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.random.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0)
                        {
                            int j1 = this.random.nextInt(21) + 10;

                            if (j1 > itemstack.stackSize)
                            {
                                j1 = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j1;
                            EntityItem entityitem = new EntityItem(p_149749_1_, (double)((float)p_149749_2_ + f), (double)((float)p_149749_3_ + f1), (double)((float)p_149749_4_ + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound())
                            {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);
                            p_149749_1_.spawnEntityInWorld(entityitem);
                        }
                    }
                }

                p_149749_1_.func_147453_f(p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_);
            }
        }

        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
    }
}
