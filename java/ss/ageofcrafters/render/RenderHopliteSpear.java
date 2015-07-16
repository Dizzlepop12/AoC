package ss.ageofcrafters.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import ss.ageofcrafters.model.ModelHopliteSpear;

public class RenderHopliteSpear implements IItemRenderer{

	private ModelHopliteSpear hopliteSpear;
	
	private static final ResourceLocation texture = new ResourceLocation("aob:textures/model/hopliteSpear.png");
	
	public RenderHopliteSpear(){
		
		hopliteSpear = new ModelHopliteSpear();
	
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
			
			GL11.glScalef(1f, 2f, 1.25f);
			
			GL11.glTranslatef(.65F, 1.2F + .21F, .0F);
			
			GL11.glRotatef(-180, 0F, 0F, 0F);
			
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			
			this.hopliteSpear.renderModel(.06250F);
			
			GL11.glPopMatrix();
			
		}
		case EQUIPPED_FIRST_PERSON:{
			GL11.glPushMatrix();
			
			GL11.glScalef(1f, 2f, 1.25f);
			
			GL11.glTranslatef(.65F,  1.2F + .21F, .0F);
			
			GL11.glRotatef(-180, 0F, 0F, 0F);
			
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			
			this.hopliteSpear.renderModel(.06250F);
			
			GL11.glPopMatrix();
		}
		default:
			break;
		}
	}

}
