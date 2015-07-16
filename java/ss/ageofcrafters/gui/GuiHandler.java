package ss.ageofcrafters.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ss.ageofcrafters.blocks.tileentities.TileEntityAlloyingTable;
import ss.ageofcrafters.blocks.tileentities.TileEntityAltar;
import ss.ageofcrafters.blocks.tileentities.TileEntityDesigner;
import ss.ageofcrafters.container.ContainerAlloyingTable;
import ss.ageofcrafters.container.ContainerAltar;
import ss.ageofcrafters.container.ContainerDesigner;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x,y, z);
		
		if (entity != null){
			switch(ID) {
			case AgeOfCrafters.guiIdDesigner:
				if(entity instanceof TileEntityDesigner) {
					return new ContainerDesigner(player.inventory, (TileEntityDesigner) entity);
				}
			case AgeOfCrafters.guiIdAlloyingTable:
				if(entity instanceof TileEntityAlloyingTable) {
					return new ContainerAlloyingTable(player.inventory, (TileEntityAlloyingTable) entity);
				}
			case AgeOfCrafters.guiIdAltar:
				if(entity instanceof TileEntityAltar) {
					return new ContainerAltar(player.inventory, (TileEntityAltar) entity);
				}
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x,y, z);
		
		if (entity != null){
			switch(ID) {
			case AgeOfCrafters.guiIdDesigner:
				if(entity instanceof TileEntityDesigner) {
					return new GuiDesigner(player.inventory, (TileEntityDesigner) entity);
				}
			case AgeOfCrafters.guiIdAlloyingTable:
				if(entity instanceof TileEntityAlloyingTable) {
					return new GuiAlloyingTable(player.inventory, (TileEntityAlloyingTable) entity);
				}
			case AgeOfCrafters.guiIdAltar:
				if(entity instanceof TileEntityAltar) {
					return new GuiAltar(player.inventory, (TileEntityAltar) entity);
				}
			}
			
		}
		return null;
	}

}
