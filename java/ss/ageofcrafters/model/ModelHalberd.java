package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHalberd extends ModelBase
{
  //fields
    ModelRenderer HANDLE;
    ModelRenderer TUBE;
    ModelRenderer AXE3;
    ModelRenderer AXE;
    ModelRenderer AXE2;
    ModelRenderer PIKE;
    ModelRenderer PIKE2;
  
  public ModelHalberd()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      HANDLE = new ModelRenderer(this, 0, 30);
      HANDLE.addBox(-24F, 0F, 0F, 24, 1, 1);
      HANDLE.setRotationPoint(8F, 5F, 0F);
      HANDLE.setTextureSize(64, 32);
      HANDLE.mirror = true;
      setRotation(HANDLE, 0F, 0F, 0F);
      TUBE = new ModelRenderer(this, 0, 26);
      TUBE.addBox(0F, 0F, 0F, 8, 2, 2);
      TUBE.setRotationPoint(-24F, 4.5F, -0.5F);
      TUBE.setTextureSize(64, 32);
      TUBE.mirror = true;
      setRotation(TUBE, 0F, 0F, 0F);
      AXE3 = new ModelRenderer(this, 0, 19);
      AXE3.addBox(0F, 0F, 0F, 3, 6, 1);
      AXE3.setRotationPoint(-21F, 7.066667F, 0F);
      AXE3.setTextureSize(64, 32);
      AXE3.mirror = true;
      setRotation(AXE3, 0F, 0F, -0.745849F);
      AXE = new ModelRenderer(this, 0, 19);
      AXE.addBox(0F, 0F, 0F, 6, 6, 1);
      AXE.setRotationPoint(-23F, 5.466667F, 0F);
      AXE.setTextureSize(64, 32);
      AXE.mirror = true;
      setRotation(AXE, 0F, 0F, 0F);
      AXE2 = new ModelRenderer(this, 0, 19);
      AXE2.addBox(0F, 0F, 0F, 3, 6, 1);
      AXE2.setRotationPoint(-21F, 5.066667F, 0F);
      AXE2.setTextureSize(64, 32);
      AXE2.mirror = true;
      setRotation(AXE2, 0F, 0F, 0.7807508F);
      PIKE = new ModelRenderer(this, 0, 17);
      PIKE.addBox(0F, 0F, 0F, 4, 1, 1);
      PIKE.setRotationPoint(-28F, 5F, 0F);
      PIKE.setTextureSize(64, 32);
      PIKE.mirror = true;
      setRotation(PIKE, 0F, 0F, 0F);
      PIKE2 = new ModelRenderer(this, 0, 13);
      PIKE2.addBox(0F, 0F, 0F, 1, 3, 1);
      PIKE2.setRotationPoint(-20.5F, 2F, 0F);
      PIKE2.setTextureSize(64, 32);
      PIKE2.mirror = true;
      setRotation(PIKE2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    HANDLE.render(f5);
    TUBE.render(f5);
    AXE3.render(f5);
    AXE.render(f5);
    AXE2.render(f5);
    PIKE.render(f5);
    PIKE2.render(f5);
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
    HANDLE.render(f5);
    TUBE.render(f5);
    AXE3.render(f5);
    AXE.render(f5);
    AXE2.render(f5);
    PIKE.render(f5);
    PIKE2.render(f5);	
}

}
