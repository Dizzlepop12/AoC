package ss.ageofcrafters.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBullet extends EntityThrowable
{
   public float explosionRadius = 2;
   public static Entity ent;
public EntityBullet(World par1World)
   {
       super(par1World);
   }
   public EntityBullet(World par1World, EntityPlayer player)
   {
       super(par1World, player);
   }
   public EntityBullet(World par1World, double par2, double par4, double par6)
   {
       super(par1World, par2, par4, par6);
   }
   @Override
   protected void onImpact(MovingObjectPosition movingobjectposition) 
   {
   }
}
