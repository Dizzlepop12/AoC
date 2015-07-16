package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAlloyingTable extends ModelBase
{
  //fields
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer table;
    ModelRenderer Shape4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape8;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ModelAlloyingTable()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      leg4 = new ModelRenderer(this, 0, 0);
      leg4.addBox(0F, 0F, 0F, 1, 12, 1);
      leg4.setRotationPoint(-3F, 12F, 4F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = false;
      setRotation(leg4, -0.1570796F, 3.141593F, -0.1570796F);
      leg1 = new ModelRenderer(this, 0, 0);
      leg1.addBox(0F, 0F, 0F, 1, 12, 1);
      leg1.setRotationPoint(-3F, 12F, -3F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = false;
      setRotation(leg1, 0.1570796F, 3.141593F, -0.1570796F);
      leg2 = new ModelRenderer(this, 0, 0);
      leg2.addBox(0F, 0F, 0F, 1, 12, 1);
      leg2.setRotationPoint(4F, 12F, -3F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = false;
      setRotation(leg2, 0.1570796F, 3.141593F, 0.1570796F);
      leg3 = new ModelRenderer(this, 0, 0);
      leg3.addBox(0F, 0F, 0F, 1, 12, 1);
      leg3.setRotationPoint(4F, 12F, 4F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = false;
      setRotation(leg3, -0.1570796F, 3.141593F, 0.1570796F);
      table = new ModelRenderer(this, 32, 0);
      table.addBox(0F, 0F, 0F, 8, 1, 8);
      table.setRotationPoint(-4F, 12F, -4F);
      table.setTextureSize(64, 32);
      table.mirror = true;
      setRotation(table, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 16, -8);
      Shape4.addBox(0F, -1F, 0F, 0, 1, 8);
      Shape4.setRotationPoint(-4F, 12F, -4F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 16, 0);
      Shape1.addBox(0F, -1F, 0F, 8, 1, 0);
      Shape1.setRotationPoint(-4F, 12F, 4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 16, 0);
      Shape2.addBox(0F, -1F, 0F, 8, 1, 0);
      Shape2.setRotationPoint(-4F, 12F, -4F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 16, -8);
      Shape3.addBox(0F, -1F, 0F, 0, 1, 8);
      Shape3.setRotationPoint(4F, 12F, -4F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 32, 9);
      Shape8.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape8.setRotationPoint(4F, 15F, -4.3F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, -1.570796F, 0F);
      Shape5 = new ModelRenderer(this, 32, 9);
      Shape5.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape5.setRotationPoint(-4F, 15F, 3.333333F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 32, 9);
      Shape6.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape6.setRotationPoint(-4F, 15F, -4.3F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 32, 9);
      Shape7.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape7.setRotationPoint(-3.6F, 15F, -4F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, -1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    leg4.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    table.render(f5);
    Shape4.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape8.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
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

public void renderModel(float f) {
    leg4.render(f);
    leg1.render(f);
    leg2.render(f);
    leg3.render(f);
    table.render(f);
    Shape4.render(f);
    Shape1.render(f);
    Shape2.render(f);
    Shape3.render(f);
    Shape8.render(f);
    Shape5.render(f);
    Shape6.render(f);
    Shape7.render(f);
	// TODO Auto-generated method stub
	
}

}
