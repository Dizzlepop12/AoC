package ss.ageofcrafters.units;

import net.minecraft.client.model.ModelHorse;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ss.ageofcrafters.main.AgeOfCraftersArmor;
import ss.ageofcrafters.main.AgeOfCraftersTools;

public class EntityWarrior extends EntityMob
{
    public EntityWarrior(World world)
    {
        super(world);
        this.setCurrentItemOrArmor(0, new ItemStack(AgeOfCraftersTools.SteelSword));
        this.setCurrentItemOrArmor(1, new ItemStack(AgeOfCraftersArmor.SteelHelmetClassic));
        this.setCurrentItemOrArmor(2, new ItemStack(AgeOfCraftersArmor.SteelPlateClassic));
        this.setCurrentItemOrArmor(3, new ItemStack(AgeOfCraftersArmor.SteelLeggingsClassic));
        this.setCurrentItemOrArmor(4, new ItemStack(AgeOfCraftersArmor.SteelBootsClassic));
        
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.setSize(0.6F, 1.8F);

        
    }
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D * 1.2);
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }
}