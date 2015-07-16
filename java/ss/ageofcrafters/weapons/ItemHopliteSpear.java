package ss.ageofcrafters.weapons;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHopliteSpear extends ItemSword{
	public ItemHopliteSpear(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}