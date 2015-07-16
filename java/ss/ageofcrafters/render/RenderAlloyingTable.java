package ss.ageofcrafters.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.model.ModelAlloyingTable;

public class RenderAlloyingTable extends TileEntitySpecialRenderer{

	private static final ResourceLocation texture = new ResourceLocation(AgeOfCrafters.modid + ":" + "textures/model/AlloyingTable.png");
	
	private ModelAlloyingTable model;
		
	
	public RenderAlloyingTable(){
		this.model = new ModelAlloyingTable();
	}
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f) {
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x + 0.5F,(float)y + 2f, (float)z + 0.5F);
			GL11.glRotatef(180, 0f, 0f, 1f);
			GL11.glScalef(1.4F, 1.4F, 1.4F);
			

			this.bindTexture(texture);
				this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		
	}

}
