package ss.ageofcrafters.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import ss.ageofcrafters.blocks.tileentities.TileEntityDesigner;
import ss.ageofcrafters.container.ContainerDesigner;
import ss.ageofcrafters.main.AgeOfCrafters;

public class GuiDesigner extends GuiContainer{

	private ResourceLocation texture = new ResourceLocation("aob"+":"+ "textures/gui/Designer.png");
	private TileEntityDesigner designer;
	
	public GuiDesigner(InventoryPlayer inv, TileEntityDesigner teDesigner) {
		super(new ContainerDesigner(inv, teDesigner));
		designer = teDesigner;
		
		this.xSize = 176;
		this.ySize = 166;
	}


    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        String s = this.designer.hasCustomInventoryName() ? this.designer.getInventoryName() : I18n.format(this.designer.getInventoryName(), new Object[0]);
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

        if (this.designer.isCarving())
        {
            int i1 = this.designer.getPowerRemainingScaled(13);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
            i1 = this.designer.getDesignerProgressScaled(24);
            this.drawTexturedModalRect(k + 89, l + 34, 176, 0, i1 + 1, 16);
        }
    }
}
