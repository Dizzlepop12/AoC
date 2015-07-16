package ss.ageofcrafters.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemAoBLeaves extends ItemBlockWithMetadata{

	final static String [] leaves = new String [] {"pine", "ash"};

	
	public ItemAoBLeaves(Block block) {
		super(block, block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= leaves.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + leaves[i];
	}
	public int getMetadata(int meta) {
		return meta;
	}

}
