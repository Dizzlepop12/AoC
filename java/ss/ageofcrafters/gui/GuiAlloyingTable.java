package ss.ageofcrafters.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import ss.ageofcrafters.blocks.tileentities.TileEntityAlloyingTable;
import ss.ageofcrafters.container.ContainerAlloyingTable;

public class GuiAlloyingTable extends GuiContainer{

	private ResourceLocation texture = new ResourceLocation("aob"+":"+ "textures/gui/alloying.png");
	private TileEntityAlloyingTable alloyingTable;
	
	public GuiAlloyingTable(InventoryPlayer inv, TileEntityAlloyingTable teAlloyingTable) {
		super(new ContainerAlloyingTable(inv, teAlloyingTable));
		alloyingTable = teAlloyingTable;
		
		this.xSize = 176;
		this.ySize = 166;
	}


    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        String s = this.alloyingTable.hasCustomInventoryName() ? this.alloyingTable.getInventoryName() : I18n.format(this.alloyingTable.getInventoryName(), new Object[0]);
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

        if (this.alloyingTable.isAlloying())
        {
        	/**
             * Draws a textured rectangle at the stored z-value. Args: x, y, u, v, width, height
             */
        	
        	int i1 = this.alloyingTable.getPowerRemainingScaled(34);
            this.drawTexturedModalRect(k + 7, l + 17, 176, 16, i1 + 16, 51);
             
            i1 = this.alloyingTable.getAlloyingProcessScaled(24);
            this.drawTexturedModalRect(k + 89, l + 34, 176, 0, i1, 17);
        }
        
        
    }
    
    
}
