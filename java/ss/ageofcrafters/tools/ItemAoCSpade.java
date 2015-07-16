package ss.ageofcrafters.tools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import ss.ageofcrafters.main.AgeOfCrafters;

public class ItemAoCSpade extends ItemSpade{

	private Item repair;
	
	public ItemAoCSpade(ToolMaterial tm, Item repair) {
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
