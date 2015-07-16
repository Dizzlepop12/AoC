package ss.ageofcrafters.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import ss.ageofcrafters.main.AgeOfCrafters;

public class ItemCarver extends Item{
	
	public ItemCarver(){
		super();

		}	
	
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
		
}
