package ss.ageofcrafters.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import ss.ageofcrafters.blocks.tileentities.TileEntityAltar;
import ss.ageofcrafters.container.ContainerAltar;

public class GuiAltar extends GuiContainer{

	private ResourceLocation texture = new ResourceLocation("aob"+":"+ "textures/gui/altarupg.png");
	private TileEntityAltar altar;
	
	public GuiAltar(InventoryPlayer inv, TileEntityAltar teAltar) {
		super(new ContainerAltar(inv, teAltar));
		altar = teAltar;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	GuiFurnace f;


    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        String s = this.altar.hasCustomInventoryName() ? this.altar.getInventoryName() : I18n.format(this.altar.getInventoryName(), new Object[0]);
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int leftSide = (this.width - this.xSize) / 2;
        int topY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(leftSide, topY, 0, 0, this.xSize, this.ySize);

        if (this.altar.isCreating())
        {
        	/*12 IS THE SIZE OF THE FLAME DOWNWARDS, JUST TO MAKE IT MORE READABLE*/
        	/*FLAME CODE*/
            int i1 = this.altar.getPowerRemainingScaled(13);
            this.drawTexturedModalRect(leftSide + 57, topY + 37 + i1 , 176, i1, 14,12);
            
            /*ARROW CODE*/
            i1 = this.altar.getCreatingProcessScaled(24);
            this.drawTexturedModalRect(leftSide + 79, topY + 34, 176, 14, i1 + 1, 16);
        }
    }
}
