package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrater extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape7;
    ModelRenderer Shape5;
    ModelRenderer Shape8;
    ModelRenderer Shape6;
    ModelRenderer Shape10;
    ModelRenderer Shape9;
    ModelRenderer Shape12;
    ModelRenderer Shape11;
  
  public ModelCrater()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      base = new ModelRenderer(this, 0, 24);
      base.addBox(0F, 0F, 0F, 6, 2, 6);
      base.setRotationPoint(-3F, 22F, -3F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 19);
      Shape1.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape1.setRotationPoint(-2F, 21.5F, -2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 3, 6, 3);
      Shape2.setRotationPoint(-1.5F, 16F, -1.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 24, 27);
      Shape3.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape3.setRotationPoint(-2F, 16F, -2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 24, 18);
      Shape4.addBox(0F, 0F, 0F, 8, 1, 8);
      Shape4.setRotationPoint(-4F, 15F, -4F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 31, 4);
      Shape7.addBox(0F, 0F, 0F, 1, 6, 8);
      Shape7.setRotationPoint(4F, 9F, -4F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 31, 4);
      Shape5.addBox(0F, 0F, 0F, 1, 6, 8);
      Shape5.setRotationPoint(-5F, 9F, -4F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 30, 11);
      Shape8.addBox(0F, 0F, 0F, 8, 6, 1);
      Shape8.setRotationPoint(-4F, 9F, 4F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 30, 11);
      Shape6.addBox(0F, 0F, 0F, 8, 6, 1);
      Shape6.setRotationPoint(-4F, 9F, -5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 0);
      Shape10.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape10.setRotationPoint(6F, 9F, 0F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 0);
      Shape9.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape9.setRotationPoint(-7F, 9F, 0F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 0);
      Shape12.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape12.setRotationPoint(5F, 10F, 0F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 0, 0);
      Shape11.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape11.setRotationPoint(-6F, 10F, 0F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape7.render(f5);
    Shape5.render(f5);
    Shape8.render(f5);
    Shape6.render(f5);
    Shape10.render(f5);
    Shape9.render(f5);
    Shape12.render(f5);
    Shape11.render(f5);
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
    base.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape7.render(f5);
    Shape5.render(f5);
    Shape8.render(f5);
    Shape6.render(f5);
    Shape10.render(f5);
    Shape9.render(f5);
    Shape12.render(f5);
    Shape11.render(f5);	
}

}
