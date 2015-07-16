package ss.ageofcrafters.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EthnicBook extends Item
{
       public EthnicBook(){
    	   super();
       }
       @SideOnly(Side.CLIENT)
       public void registerIcons(IIconRegister reg){
    	   this.itemIcon = reg.registerIcon(AgeOfCrafters.modid + ":" + this.getUnlocalizedName().substring(5));
       }
}
      
