package ss.ageofcrafters.weapons;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedSteelSpear extends ItemSword{
	public RedSteelSpear(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}