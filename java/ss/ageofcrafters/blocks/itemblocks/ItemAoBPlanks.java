package ss.ageofcrafters.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemAoBPlanks extends ItemBlock{

	final static String [] subBlocks = new String [] { "pine", "olive"};

	
	public ItemAoBPlanks(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= subBlocks.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + subBlocks[i];
	}
	public int getMetadata(int meta) {
		return meta;
	}

}
