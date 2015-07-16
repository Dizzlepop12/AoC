package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBust extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer head;
  
  public ModelBust()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      base = new ModelRenderer(this, 0, 0);
      base.addBox(0F, 0F, 0F, 10, 1, 4);
      base.setRotationPoint(-5F, 23F, -2F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 5);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 23F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, -0.0698132F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    head.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  public void renderModel(float f){
	    base.render(f);
	    head.render(f);
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
