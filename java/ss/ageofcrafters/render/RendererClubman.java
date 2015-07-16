package ss.ageofcrafters.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.model.ModelClubman;
import ss.ageofcrafters.units.EntityClubman;

public class RendererClubman extends RenderLiving{

	private static final ResourceLocation texture = new ResourceLocation(AgeOfCrafters.modid + ":" + "textures/mobs/Clubman.png");
	
	protected ModelClubman modelEntity;
	
	public RendererClubman(ModelBase model, float par2) {
		super(model, par2);
		modelEntity = ((ModelClubman) mainModel);
	}
	
	public void renderClubman(EntityClubman entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderClubman((EntityClubman)entityLiving, x, y, z, u, v);
	}
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderClubman((EntityClubman)entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return texture;
	}

}
