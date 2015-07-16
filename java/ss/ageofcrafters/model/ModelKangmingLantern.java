package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKangmingLantern extends ModelBase
{
  //fields
    ModelRenderer hl6;
    ModelRenderer hl8;
    ModelRenderer hl7;
    ModelRenderer hl4;
    ModelRenderer ls4;
    ModelRenderer ls1;
    ModelRenderer ls3;
    ModelRenderer ls2;
    ModelRenderer hs2;
    ModelRenderer hs1;
    ModelRenderer torch;
    ModelRenderer hl5;
    ModelRenderer hl3;
    ModelRenderer hl2;
    ModelRenderer hl1;
    ModelRenderer ss4;
    ModelRenderer ss1;
    ModelRenderer ss2;
    ModelRenderer ss3;
  
  public ModelKangmingLantern()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      hl6 = new ModelRenderer(this, 0, 21);
      hl6.addBox(0F, 0F, 0F, 1, 1, 10);
      hl6.setRotationPoint(-4F, 14F, -5F);
      hl6.setTextureSize(64, 32);
      hl6.mirror = true;
      setRotation(hl6, 0F, 0F, 0F);
      hl8 = new ModelRenderer(this, 0, 30);
      hl8.addBox(0F, 0F, 0F, 10, 1, 1);
      hl8.setRotationPoint(-5F, 14F, -4F);
      hl8.setTextureSize(64, 32);
      hl8.mirror = true;
      setRotation(hl8, 0F, 0F, 0F);
      hl7 = new ModelRenderer(this, 0, 30);
      hl7.addBox(0F, 0F, 0F, 10, 1, 1);
      hl7.setRotationPoint(-5F, 14F, 3F);
      hl7.setTextureSize(64, 32);
      hl7.mirror = true;
      setRotation(hl7, 0F, 0F, 0F);
      hl4 = new ModelRenderer(this, 0, 21);
      hl4.addBox(0F, 0F, 0F, 1, 1, 10);
      hl4.setRotationPoint(3F, 22F, -5F);
      hl4.setTextureSize(64, 32);
      hl4.mirror = true;
      setRotation(hl4, 0F, 0F, 0F);
      ls4 = new ModelRenderer(this, 0, 0);
      ls4.addBox(0F, 0F, 0F, 0, 8, 6);
      ls4.setRotationPoint(3F, 15F, -3F);
      ls4.setTextureSize(64, 32);
      ls4.mirror = true;
      setRotation(ls4, 0F, 0F, 0F);
      ls1 = new ModelRenderer(this, 0, 0);
      ls1.addBox(0F, 0F, 0F, 6, 8, 0);
      ls1.setRotationPoint(-3F, 15F, -3F);
      ls1.setTextureSize(64, 32);
      ls1.mirror = true;
      setRotation(ls1, 0F, 0F, 0F);
      ls3 = new ModelRenderer(this, 0, 0);
      ls3.addBox(0F, 0F, 0F, 6, 8, 0);
      ls3.setRotationPoint(-3F, 15F, 3F);
      ls3.setTextureSize(64, 32);
      ls3.mirror = true;
      setRotation(ls3, 0F, 0F, 0F);
      ls2 = new ModelRenderer(this, 0, 0);
      ls2.addBox(0F, 0F, 0F, 0, 8, 6);
      ls2.setRotationPoint(-3F, 15F, -3F);
      ls2.setTextureSize(64, 32);
      ls2.mirror = true;
      setRotation(ls2, 0F, 0F, 0F);
      hs2 = new ModelRenderer(this, 0, 30);
      hs2.addBox(0F, 0F, 0F, 6, 1, 1);
      hs2.setRotationPoint(-3F, 22F, -0.5F);
      hs2.setTextureSize(64, 32);
      hs2.mirror = true;
      setRotation(hs2, 0F, 0F, 0F);
      hs1 = new ModelRenderer(this, 0, 30);
      hs1.addBox(0F, 0F, 0F, 1, 1, 6);
      hs1.setRotationPoint(-0.5F, 22F, -3F);
      hs1.setTextureSize(64, 32);
      hs1.mirror = true;
      setRotation(hs1, 0F, 0F, 0F);
      torch = new ModelRenderer(this, 0, 21);
      torch.addBox(0F, 0F, 0F, 1, 8, 1);
      torch.setRotationPoint(-0.4666667F, 15F, -0.5F);
      torch.setTextureSize(64, 32);
      torch.mirror = true;
      setRotation(torch, 0F, 0F, 0F);
      hl5 = new ModelRenderer(this, 0, 21);
      hl5.addBox(0F, 0F, 0F, 1, 1, 10);
      hl5.setRotationPoint(3F, 14F, -5F);
      hl5.setTextureSize(64, 32);
      hl5.mirror = true;
      setRotation(hl5, 0F, 0F, 0F);
      hl3 = new ModelRenderer(this, 0, 21);
      hl3.addBox(0F, 0F, 0F, 1, 1, 10);
      hl3.setRotationPoint(-4F, 22F, -5F);
      hl3.setTextureSize(64, 32);
      hl3.mirror = true;
      setRotation(hl3, 0F, 0F, 0F);
      hl2 = new ModelRenderer(this, 0, 30);
      hl2.addBox(0F, 0F, 0F, 10, 1, 1);
      hl2.setRotationPoint(-5F, 22F, 3F);
      hl2.setTextureSize(64, 32);
      hl2.mirror = true;
      setRotation(hl2, 0F, 0F, 0F);
      hl1 = new ModelRenderer(this, 0, 30);
      hl1.addBox(0F, 0F, 0F, 10, 1, 1);
      hl1.setRotationPoint(-5F, 22F, -4F);
      hl1.setTextureSize(64, 32);
      hl1.mirror = true;
      setRotation(hl1, 0F, 0F, 0F);
      ss4 = new ModelRenderer(this, 0, 30);
      ss4.addBox(0F, 0F, 0F, 1, 1, 1);
      ss4.setRotationPoint(-4F, 23F, 3F);
      ss4.setTextureSize(64, 32);
      ss4.mirror = true;
      setRotation(ss4, 0F, 0F, 0F);
      ss1 = new ModelRenderer(this, 0, 30);
      ss1.addBox(0F, 0F, 0F, 1, 1, 1);
      ss1.setRotationPoint(-4F, 23F, -4F);
      ss1.setTextureSize(64, 32);
      ss1.mirror = true;
      setRotation(ss1, 0F, 0F, 0F);
      ss2 = new ModelRenderer(this, 0, 30);
      ss2.addBox(0F, 0F, 0F, 1, 1, 1);
      ss2.setRotationPoint(3F, 23F, -4F);
      ss2.setTextureSize(64, 32);
      ss2.mirror = true;
      setRotation(ss2, 0F, 0F, 0F);
      ss3 = new ModelRenderer(this, 0, 30);
      ss3.addBox(0F, 0F, 0F, 1, 1, 1);
      ss3.setRotationPoint(3F, 23F, 3F);
      ss3.setTextureSize(64, 32);
      ss3.mirror = true;
      setRotation(ss3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    hl6.render(f5);
    hl8.render(f5);
    hl7.render(f5);
    hl4.render(f5);
    ls4.render(f5);
    ls1.render(f5);
    ls3.render(f5);
    ls2.render(f5);
    hs2.render(f5);
    hs1.render(f5);
    torch.render(f5);
    hl5.render(f5);
    hl3.render(f5);
    hl2.render(f5);
    hl1.render(f5);
    ss4.render(f5);
    ss1.render(f5);
    ss2.render(f5);
    ss3.render(f5);
  }
  public void renderModel(float f){
	    hl6.render(f);
	    hl8.render(f);
	    hl7.render(f);
	    hl4.render(f);
	    ls4.render(f);
	    ls1.render(f);
	    ls3.render(f);
	    ls2.render(f);
	    hs2.render(f);
	    hs1.render(f);
	    torch.render(f);
	    hl5.render(f);
	    hl3.render(f);
	    hl2.render(f);
	    hl1.render(f);
	    ss4.render(f);
	    ss1.render(f);
	    ss2.render(f);
	    ss3.render(f);
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
