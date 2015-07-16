package ss.ageofcrafters.weapons;

import java.awt.List;
import java.util.Iterator;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import ss.ageofcrafters.main.AgeOfCrafters;

public class ItemAoCSword extends ItemSword{

	private Item repair;
	
	public ItemAoCSword(ToolMaterial tm, Item repair) {
		super(tm);
		repair = this.repair;
	}
	

	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}

    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	  return stack.getItem() == repair; 
	}
	

}
