package ss.ageofcrafters.units.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderBowman extends RenderBiped
{
	private static final ResourceLocation textures = new ResourceLocation("aob:textures/mobs/Clubman.png");

	public RenderBowman(ModelBiped par1ModelBiped, float par2)
    {
        this(par1ModelBiped, par2, 1.0F);
    }

    public RenderBowman(ModelBiped par1ModelBiped, float par2, float par3)
    {
        super(par1ModelBiped, par2);
        this.modelBipedMain = par1ModelBiped;
        this.field_77070_b = par3;
        this.func_82421_b();

    }

    protected void func_82438_a(EntityLiving par1EntitySkeleton, float par2)
    {
    
    }

    protected void func_82422_c()
    {
    	
        GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
    }
    
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return textures;
    }

    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.func_82438_a((EntityLiving)par1EntityLivingBase, par2);
    }
}