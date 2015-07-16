package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStoneLion extends ModelBase
{
  //fields
    ModelRenderer leg2;
    ModelRenderer arm1;
    ModelRenderer muscle2;
    ModelRenderer muscle4;
    ModelRenderer muscle1;
    ModelRenderer muscle3;
    ModelRenderer arm2;
    ModelRenderer leg1;
    ModelRenderer hair;
    ModelRenderer face;
    ModelRenderer body;
  
  public ModelStoneLion()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      leg2 = new ModelRenderer(this, 0, 0);
      leg2.addBox(0F, 0F, -2F, 2, 1, 2);
      leg2.setRotationPoint(-4F, 23F, 6F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0.5204921F, 0F);
      arm1 = new ModelRenderer(this, 0, 27);
      arm1.addBox(0F, 0F, 0F, 2, 1, 4);
      arm1.setRotationPoint(-3F, 23F, -8F);
      arm1.setTextureSize(64, 32);
      arm1.mirror = true;
      setRotation(arm1, 0F, 0F, 0F);
      muscle2 = new ModelRenderer(this, 36, 21);
      muscle2.addBox(0F, 0F, 0F, 2, 4, 2);
      muscle2.setRotationPoint(1F, 20F, -4F);
      muscle2.setTextureSize(64, 32);
      muscle2.mirror = true;
      setRotation(muscle2, 0F, 0F, 0F);
      muscle4 = new ModelRenderer(this, 0, 0);
      muscle4.addBox(0F, 0F, 0F, 2, 4, 2);
      muscle4.setRotationPoint(2F, 20F, 6F);
      muscle4.setTextureSize(64, 32);
      muscle4.mirror = true;
      setRotation(muscle4, 0F, -0.5205006F, 0F);
      muscle1 = new ModelRenderer(this, 36, 21);
      muscle1.addBox(0F, 0F, 0F, 2, 4, 2);
      muscle1.setRotationPoint(-3F, 20F, -4F);
      muscle1.setTextureSize(64, 32);
      muscle1.mirror = true;
      setRotation(muscle1, 0F, 0F, 0F);
      muscle3 = new ModelRenderer(this, 0, 0);
      muscle3.addBox(0F, 0F, -2F, 2, 4, 2);
      muscle3.setRotationPoint(-3F, 20F, 8F);
      muscle3.setTextureSize(64, 32);
      muscle3.mirror = true;
      setRotation(muscle3, 0F, 0.5204921F, 0F);
      arm2 = new ModelRenderer(this, 0, 27);
      arm2.addBox(0F, 0F, 0F, 2, 1, 4);
      arm2.setRotationPoint(1F, 23F, -8F);
      arm2.setTextureSize(64, 32);
      arm2.mirror = true;
      setRotation(arm2, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 0);
      leg1.addBox(0F, 0F, -2F, 2, 1, 2);
      leg1.setRotationPoint(2F, 23F, 6F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, -0.5204921F, 0F);
      hair = new ModelRenderer(this, 24, 11);
      hair.addBox(0F, 0F, 0F, 6, 6, 4);
      hair.setRotationPoint(-3F, 14F, -5F);
      hair.setTextureSize(64, 32);
      hair.mirror = true;
      setRotation(hair, 0F, 0F, 0F);
      face = new ModelRenderer(this, 0, 16);
      face.addBox(0F, 0F, 0F, 3, 3, 2);
      face.setRotationPoint(-1.5F, 16F, -7F);
      face.setTextureSize(64, 32);
      face.mirror = true;
      setRotation(face, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 9);
      body.addBox(0F, 0F, 0F, 6, 5, 12);
      body.setRotationPoint(-3F, 18F, -4F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    leg2.render(f5);
    arm1.render(f5);
    muscle2.render(f5);
    muscle4.render(f5);
    muscle1.render(f5);
    muscle3.render(f5);
    arm2.render(f5);
    leg1.render(f5);
    hair.render(f5);
    face.render(f5);
    body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  public void renderModel(float f){
	    leg2.render(f);
	    arm1.render(f);
	    muscle2.render(f);
	    muscle4.render(f);
	    muscle1.render(f);
	    muscle3.render(f);
	    arm2.render(f);
	    leg1.render(f);
	    hair.render(f);
	    face.render(f);
	    body.render(f);
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
