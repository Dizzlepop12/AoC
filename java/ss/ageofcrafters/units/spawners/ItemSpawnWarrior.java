package ss.ageofcrafters.units.spawners;

import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersSpawners;
import ss.ageofcrafters.units.EntityWarrior;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSpawnWarrior extends Item {
	
	public ItemSpawnWarrior() {
		super();
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}          

	private Random rand = new Random();

	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
		if(!world.isRemote){

			EntityWarrior e = new EntityWarrior(world);

			if(itemstack.getItem() == AgeOfCraftersSpawners.SpawnWarrior) {
				e.setLocationAndAngles(x + 0.5, y + 1.5,  z + 0.5, rand.nextFloat()* 360F, 0.0F);
				world.spawnEntityInWorld(e);
				itemstack.stackSize--;
				return true;
			}
		}
		return false;      
	}

}
      