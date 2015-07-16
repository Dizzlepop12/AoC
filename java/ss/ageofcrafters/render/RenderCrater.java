package ss.ageofcrafters.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.model.ModelCrater;

public class RenderCrater extends TileEntitySpecialRenderer{

	private static final ResourceLocation texture = new ResourceLocation(AgeOfCrafters.modid + ":" + "textures/model/Crater.png");
	
	private ModelCrater model;
	
	
	public RenderCrater(){
		this.model = new ModelCrater();
	}
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F,(float)y + 1.5f, (float)z + 0.5F);
		GL11.glRotatef(180, 0f, 0f, 1f);
		GL11.glScalef(1.0F, 1.0F, 1.0F);

		this.bindTexture(texture);
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
	}
	 
}
