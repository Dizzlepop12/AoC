package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLegionArmor extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer mohawk2;
    ModelRenderer mohawk;
    ModelRenderer mohawk3;
    ModelRenderer mohawk4;
  
  public ModelLegionArmor()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      mohawk2.mirror = true;
      mohawk2 = new ModelRenderer(this, 32, 7);
      mohawk2.addBox(4F, -16F, 0F, 2, 7, 2);
      mohawk2.setRotationPoint(0F, 0F, -1F);
      mohawk2.setTextureSize(64, 32);
      mohawk2.mirror = true;
      setRotation(mohawk2, 0F, 0F, 0F);
      mohawk2.mirror = false;
      mohawk = new ModelRenderer(this, 40, 4);
      mohawk.addBox(-2F, -10F, 0F, 4, 2, 2);
      mohawk.setRotationPoint(0F, 0F, -1F);
      mohawk.setTextureSize(64, 32);
      mohawk.mirror = true;
      setRotation(mohawk, 0F, 0F, 0F);
      mohawk3 = new ModelRenderer(this, 40, 8);
      mohawk3.addBox(-4F, -16F, 0F, 8, 6, 2);
      mohawk3.setRotationPoint(0F, 0F, -1F);
      mohawk3.setTextureSize(64, 32);
      mohawk3.mirror = true;
      setRotation(mohawk3, 0F, 0F, 0F);
      mohawk4 = new ModelRenderer(this, 32, 7);
      mohawk4.addBox(-6F, -16F, 0F, 2, 7, 2);
      mohawk4.setRotationPoint(0F, 0F, -1F);
      mohawk4.setTextureSize(64, 32);
      mohawk4.mirror = true;
      setRotation(mohawk4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    mohawk2.render(f5);
    mohawk.render(f5);
    mohawk3.render(f5);
    mohawk4.render(f5);
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
