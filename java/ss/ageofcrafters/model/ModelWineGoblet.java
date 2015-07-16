package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWineGoblet extends ModelBase
{
  //fields
    ModelRenderer piece1;
    ModelRenderer base;
    ModelRenderer base2;
    ModelRenderer cup1;
    ModelRenderer side4;
    ModelRenderer side3;
    ModelRenderer side1;
    ModelRenderer side2;
    ModelRenderer water;
  
  public ModelWineGoblet()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      piece1 = new ModelRenderer(this, 0, 0);
      piece1.addBox(0F, 0F, 0F, 2, 5, 2);
      piece1.setRotationPoint(-1F, 17F, -1F);
      piece1.setTextureSize(64, 32);
      piece1.mirror = true;
      setRotation(piece1, 0F, 0F, 0F);
      base = new ModelRenderer(this, 0, 0);
      base.addBox(0F, 0F, 0F, 6, 1, 6);
      base.setRotationPoint(-3F, 23F, -3F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      base2 = new ModelRenderer(this, 0, 0);
      base2.addBox(0F, 0F, 0F, 4, 1, 4);
      base2.setRotationPoint(-2F, 22F, -2F);
      base2.setTextureSize(64, 32);
      base2.mirror = true;
      setRotation(base2, 0F, 0F, 0F);
      cup1 = new ModelRenderer(this, 0, 0);
      cup1.addBox(0F, 0F, 0F, 5, 1, 5);
      cup1.setRotationPoint(-2.5F, 16F, -2.5F);
      cup1.setTextureSize(64, 32);
      cup1.mirror = true;
      setRotation(cup1, 0F, 0F, 0F);
      side4 = new ModelRenderer(this, 0, 0);
      side4.addBox(0F, 0F, 0F, 1, 3, 5);
      side4.setRotationPoint(2.2F, 13F, -2.466667F);
      side4.setTextureSize(64, 32);
      side4.mirror = true;
      setRotation(side4, 0F, 0F, 0F);
      side3 = new ModelRenderer(this, 0, 0);
      side3.addBox(0F, 0F, 0F, 5, 3, 1);
      side3.setRotationPoint(-2.5F, 13F, -3.2F);
      side3.setTextureSize(64, 32);
      side3.mirror = true;
      setRotation(side3, 0F, 0F, 0F);
      side1 = new ModelRenderer(this, 0, 0);
      side1.addBox(0F, 0F, 0F, 5, 3, 1);
      side1.setRotationPoint(-2.5F, 13F, 2.2F);
      side1.setTextureSize(64, 32);
      side1.mirror = true;
      setRotation(side1, 0F, 0F, 0F);
      side2 = new ModelRenderer(this, 0, 0);
      side2.addBox(0F, 0F, 0F, 1, 3, 5);
      side2.setRotationPoint(-3.166667F, 13F, -2.466667F);
      side2.setTextureSize(64, 32);
      side2.mirror = true;
      setRotation(side2, 0F, 0F, 0F);
      water = new ModelRenderer(this, 0, 9);
      water.addBox(0F, 0F, 0F, 4, 2, 4);
      water.setRotationPoint(-2F, 14F, -2F);
      water.setTextureSize(64, 32);
      water.mirror = true;
      setRotation(water, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    piece1.render(f5);
    base.render(f5);
    base2.render(f5);
    cup1.render(f5);
    side4.render(f5);
    side3.render(f5);
    side1.render(f5);
    side2.render(f5);
    water.render(f5);
  }
  public void renderModel(float f5){
	    piece1.render(f5);
	    base.render(f5);
	    base2.render(f5);
	    cup1.render(f5);
	    side4.render(f5);
	    side3.render(f5);
	    side1.render(f5);
	    side2.render(f5);
	    water.render(f5);
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
