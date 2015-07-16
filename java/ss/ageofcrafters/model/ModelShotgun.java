// Date: 20/10/2014 19:57:32
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelShotgun extends ModelBase
{
  //fields
    ModelRenderer handle;
    ModelRenderer shoot;
    ModelRenderer trigger;
  
  public ModelShotgun()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      handle = new ModelRenderer(this, 44, 0);
      handle.addBox(0F, 0F, 0F, 2, 6, 2);
      handle.setRotationPoint(0.1333333F, 4.933333F, 0F);
      handle.setTextureSize(64, 32);
      handle.mirror = true;
      setRotation(handle, 0F, 0F, -0.4363323F);
      shoot = new ModelRenderer(this, 8, 0);
      shoot.addBox(0F, 0F, 0F, 16, 2, 2);
      shoot.setRotationPoint(-14.16667F, 4F, 0F);
      shoot.setTextureSize(64, 32);
      shoot.mirror = true;
      setRotation(shoot, 0F, 0F, 0F);
      trigger = new ModelRenderer(this, 0, 0);
      trigger.addBox(0F, 0F, 0F, 3, 2, 1);
      trigger.setRotationPoint(-2F, 5F, 0.5F);
      trigger.setTextureSize(64, 32);
      trigger.mirror = true;
      setRotation(trigger, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    handle.render(f5);
    shoot.render(f5);
    trigger.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void renderModel(float f5){
	    handle.render(f5);
	    shoot.render(f5);
	    trigger.render(f5);
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {

	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
