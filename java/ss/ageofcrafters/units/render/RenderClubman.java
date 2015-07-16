package ss.ageofcrafters.units.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class RenderClubman extends RenderBiped {

	private static final ResourceLocation mobTextures = new ResourceLocation("aob:textures/mobs/Clubman.png");

	public RenderClubman(ModelBiped biped, float par2) {
		super(biped, par2);
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){

		return mobTextures;

	}
}
