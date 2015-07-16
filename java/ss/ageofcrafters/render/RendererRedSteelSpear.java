package ss.ageofcrafters.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.model.ModelGreatSpear;

public class RendererRedSteelSpear implements IItemRenderer{

	private ModelGreatSpear greatSpear;
	
	private static final ResourceLocation texture = new ResourceLocation(AgeOfCrafters.modid, "textures/blocks/AoBOreBlocks-redSteel.png");
	
	public RendererRedSteelSpear(){
		
	greatSpear = new ModelGreatSpear();
	
	}
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		
		switch(type){
		
		case EQUIPPED : return true;
		
		
		case EQUIPPED_FIRST_PERSON: return true;
		
		default: return false;
		}
	}

	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		
		switch(type){
		
		case EQUIPPED:{
			GL11.glPushMatrix();
			
			GL11.glScalef(1f, 2f, 1f);
			
			GL11.glTranslatef(.7F, .99F + .21F, .0F);
			
			GL11.glRotatef(-180, 0F, 0F, 0F);
			
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			
			this.greatSpear.renderModel(.06250F);
			
			GL11.glPopMatrix();
			
		}
		case EQUIPPED_FIRST_PERSON:{
			GL11.glPushMatrix();
			
			GL11.glScalef(1f, 2f, 1f);
			
			GL11.glTranslatef(.7F, .99F + .21F, .0F);
			
			GL11.glRotatef(-180, 0F, 0F, 0F);
			
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			
			this.greatSpear.renderModel(.06250F);
			
			GL11.glPopMatrix();
		}
		default:
			break;
		}
	}

}
