package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAltar extends ModelBase
{
  //fields
    ModelRenderer top;
    ModelRenderer base3;
    ModelRenderer post;
    ModelRenderer base2;
    ModelRenderer base;
    ModelRenderer side4;
    ModelRenderer side1;
    ModelRenderer side2;
    ModelRenderer side3;
  
  public ModelAltar()
  {
	  textureWidth = 128;
	  textureHeight = 64;

	  top = new ModelRenderer(this, 0, 14);
	  top.addBox(0F, 0F, 0F, 16, 1, 16);
	  top.setRotationPoint(-8F, 9F, -8F);
	  top.setTextureSize(128, 64);
	  top.mirror = true;
	  setRotation(top, 0F, 0F, 0F);
	  base3 = new ModelRenderer(this, 0, 2);
	  base3.addBox(0F, 0F, 0F, 10, 2, 10);
	  base3.setRotationPoint(-5F, 10F, -5F);
	  base3.setTextureSize(128, 64);
	  base3.mirror = true;
	  setRotation(base3, 0F, 0F, 0F);
	  post = new ModelRenderer(this, 52, 2);
	  post.addBox(0F, 0F, 0F, 3, 9, 3);
	  post.setRotationPoint(-1.5F, 12F, -1.5F);
	  post.setTextureSize(128, 64);
	  post.mirror = true;
	  setRotation(post, 0F, 0F, 0F);
	  base2 = new ModelRenderer(this, 0, 2);
	  base2.addBox(0F, 0F, 0F, 10, 1, 10);
	  base2.setRotationPoint(-5F, 21F, -5F);
	  base2.setTextureSize(128, 64);
	  base2.mirror = true;
	  setRotation(base2, 0F, 0F, 0F);
	  base = new ModelRenderer(this, 0, 32);
	  base.addBox(0F, 0F, 0F, 16, 2, 16);
	  base.setRotationPoint(-8F, 22F, -8F);
	  base.setTextureSize(128, 64);
	  base.mirror = true;
	  setRotation(base, 0F, 0F, 0F);
	  side4 = new ModelRenderer(this, 64, 33);
	  side4.addBox(0F, 0F, 0F, 16, 1, 1);
	  side4.setRotationPoint(-8F, 8F, 7F);
	  side4.setTextureSize(128, 64);
	  side4.mirror = true;
	  setRotation(side4, 0F, 0F, 0F);
	  side1 = new ModelRenderer(this, 64, 33);
	  side1.addBox(0F, 0F, 0F, 1, 1, 16);
	  side1.setRotationPoint(7F, 8F, -8F);
	  side1.setTextureSize(128, 64);
	  side1.mirror = true;
	  setRotation(side1, 0F, 0F, 0F);
	  side2 = new ModelRenderer(this, 64, 33);
	  side2.addBox(0F, 0F, 0F, 1, 1, 16);
	  side2.setRotationPoint(-8F, 8F, -8F);
	  side2.setTextureSize(128, 64);
	  side2.mirror = true;
	  setRotation(side2, 0F, 0F, 0F);
	  side3 = new ModelRenderer(this, 64, 33);
	  side3.addBox(0F, 0F, 0F, 16, 1, 1);
	  side3.setRotationPoint(-8F, 8F, -8F);
	  side3.setTextureSize(128, 64);
	  side3.mirror = true;
	  setRotation(side3, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.render(entity, f, f1, f2, f3, f4, f5);
	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  top.render(f5);
	  base3.render(f5);
	  post.render(f5);
	  base2.render(f5);
	  base.render(f5);
	  side4.render(f5);
	  side1.render(f5);
	  side2.render(f5);
	  side3.render(f5);
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

  public void renderModel(float f5) {
	  top.render(f5);
	  base3.render(f5);
	  post.render(f5);
	  base2.render(f5);
	  base.render(f5);
	  side4.render(f5);
	  side1.render(f5);
	  side2.render(f5);
	  side3.render(f5);

  }

}
