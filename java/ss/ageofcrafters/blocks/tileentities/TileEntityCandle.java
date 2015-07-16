package ss.ageofcrafters.blocks.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCandle extends TileEntity {

	private int facingDirection;
	   
	   public int getFacingDirection()
	    {
	        return this.facingDirection;
	    }
	   
	   public void setFacingDirection(int par1)
	    {
	        this.facingDirection = par1;
	    }
	   
	   @Override
	    public void readFromNBT(NBTTagCompound nbttagcompound)
	    {
	        super.readFromNBT(nbttagcompound);  
	        facingDirection = nbttagcompound.getInteger("facingDirection");
	    }

	    @Override
	    public void writeToNBT(NBTTagCompound nbttagcompound)
	    {
	        super.writeToNBT(nbttagcompound);
	        nbttagcompound.setInteger("facingDirection", facingDirection);
	    }
	    @Override
	    public Packet getDescriptionPacket()
	    {
	        NBTTagCompound tag = new NBTTagCompound();
	        writeToNBT(tag);
	        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
	    }

	    @Override
	    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
	    {
	        readFromNBT(packet.func_148857_g());
	    }

	    
	}