package ss.ageofcrafters.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemAoBLogs extends ItemBlock{

	final static String [] logs = new String [] {"pine", "olive"};

	
	public ItemAoBLogs(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= logs.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + logs[i];
	}
	public int getMetadata(int meta) {
		return meta;
	}

}
