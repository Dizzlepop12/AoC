package ss.ageofcrafters.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCandle extends ModelBase
{
  //fields
    ModelRenderer base0;
    ModelRenderer candle3;
    ModelRenderer sustain3;
    ModelRenderer base4;
    ModelRenderer base2;
    ModelRenderer base;
    ModelRenderer sustain2;
    ModelRenderer sustain1;
    ModelRenderer base6;
    ModelRenderer base5;
    ModelRenderer base3;
    ModelRenderer candle2;
    ModelRenderer candle1;
  
  public ModelCandle()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      base0 = new ModelRenderer(this, 0, 25);
      base0.addBox(0F, 0F, 0F, 6, 1, 6);
      base0.setRotationPoint(-3F, 23F, -3F);
      base0.setTextureSize(64, 32);
      base0.mirror = true;
      setRotation(base0, 0F, 0F, 0F);
      candle3 = new ModelRenderer(this, 8, 3);
      candle3.addBox(0F, 0F, 0F, 2, 3, 2);
      candle3.setRotationPoint(5F, 8F, -1F);
      candle3.setTextureSize(64, 32);
      candle3.mirror = true;
      setRotation(candle3, 0F, 0F, 0F);
      sustain3 = new ModelRenderer(this, 8, 8);
      sustain3.addBox(0F, 0F, 0F, 4, 4, 4);
      sustain3.setRotationPoint(4F, 11F, -2F);
      sustain3.setTextureSize(64, 32);
      sustain3.mirror = true;
      setRotation(sustain3, 0F, 0F, 0F);
      base4 = new ModelRenderer(this, 0, 15);
      base4.addBox(0F, 0F, 0F, 2, 3, 2);
      base4.setRotationPoint(-7F, 15F, -1F);
      base4.setTextureSize(64, 32);
      base4.mirror = true;
      setRotation(base4, 0F, 0F, 0F);
      base2 = new ModelRenderer(this, 0, 16);
      base2.addBox(0F, 0F, 0F, 2, 4, 2);
      base2.setRotationPoint(-1F, 18F, -1F);
      base2.setTextureSize(64, 32);
      base2.mirror = true;
      setRotation(base2, 0F, 0F, 0F);
      base = new ModelRenderer(this, 2, 20);
      base.addBox(0F, 0F, 0F, 4, 1, 4);
      base.setRotationPoint(-2F, 22F, -2F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      sustain2 = new ModelRenderer(this, 8, 8);
      sustain2.addBox(0F, 0F, 0F, 4, 4, 4);
      sustain2.setRotationPoint(-2F, 11F, -2F);
      sustain2.setTextureSize(64, 32);
      sustain2.mirror = true;
      setRotation(sustain2, 0F, 0F, 0F);
      sustain1 = new ModelRenderer(this, 8, 8);
      sustain1.addBox(0F, 0F, 0F, 4, 4, 4);
      sustain1.setRotationPoint(-8F, 11F, -2F);
      sustain1.setTextureSize(64, 32);
      sustain1.mirror = true;
      setRotation(sustain1, 0F, 0F, 0F);
      base6 = new ModelRenderer(this, 0, 15);
      base6.addBox(0F, 0F, 0F, 14, 2, 2);
      base6.setRotationPoint(-7F, 16F, -1F);
      base6.setTextureSize(64, 32);
      base6.mirror = true;
      setRotation(base6, 0F, 0F, 0F);
      base5 = new ModelRenderer(this, 0, 15);
      base5.addBox(0F, 0F, 0F, 2, 3, 2);
      base5.setRotationPoint(5F, 15F, -1F);
      base5.setTextureSize(64, 32);
      base5.mirror = true;
      setRotation(base5, 0F, 0F, 0F);
      base3 = new ModelRenderer(this, 0, 15);
      base3.addBox(0F, 0F, 0F, 2, 3, 2);
      base3.setRotationPoint(-1F, 15F, -1F);
      base3.setTextureSize(64, 32);
      base3.mirror = true;
      setRotation(base3, 0F, 0F, 0F);
      candle2 = new ModelRenderer(this, 8, 3);
      candle2.addBox(0F, 0F, 0F, 2, 3, 2);
      candle2.setRotationPoint(-1F, 8F, -1F);
      candle2.setTextureSize(64, 32);
      candle2.mirror = true;
      setRotation(candle2, 0F, 0F, 0F);
      candle1 = new ModelRenderer(this, 8, 3);
      candle1.addBox(0F, 0F, 0F, 2, 3, 2);
      candle1.setRotationPoint(-7F, 8F, -1F);
      candle1.setTextureSize(64, 32);
      candle1.mirror = true;
      setRotation(candle1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base0.render(f5);
    candle3.render(f5);
    sustain3.render(f5);
    base4.render(f5);
    base2.render(f5);
    base.render(f5);
    sustain2.render(f5);
    sustain1.render(f5);
    base6.render(f5);
    base5.render(f5);
    base3.render(f5);
    candle2.render(f5);
    candle1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void renderModel(float f){
	    base0.render(f);
	    candle3.render(f);
	    sustain3.render(f);
	    base4.render(f);
	    base2.render(f);
	    base.render(f);
	    sustain2.render(f);
	    sustain1.render(f);
	    base6.render(f);
	    base5.render(f);
	    base3.render(f);
	    candle2.render(f);
	    candle1.render(f);
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
