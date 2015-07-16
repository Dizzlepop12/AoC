package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHopliteSpear extends ModelBase
{
  //fields
    ModelRenderer handle;
    ModelRenderer fatthing;
    ModelRenderer Shape1;
  
  public ModelHopliteSpear()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      handle = new ModelRenderer(this, 4, 17);
      handle.addBox(0F, 0F, 0F, 2, 6, 2);
      handle.setRotationPoint(-1F, 18F, -1F);
      handle.setTextureSize(64, 32);
      handle.mirror = true;
      setRotation(handle, 0F, 0F, 0F);
      fatthing = new ModelRenderer(this, 0, 25);
      fatthing.addBox(0F, 0F, 0F, 3, 4, 3);
      fatthing.setRotationPoint(-1.5F, 14F, -1.5F);
      fatthing.setTextureSize(64, 32);
      fatthing.mirror = true;
      setRotation(fatthing, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 24, 1);
      Shape1.setRotationPoint(-0.5F, -10F, -0.5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    handle.render(f5);
    fatthing.render(f5);
    Shape1.render(f5);
  }
  
  public void renderModel(float f5){
	    handle.render(f5);
	    fatthing.render(f5);
	    Shape1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
