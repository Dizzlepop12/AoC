package ss.ageofcrafters.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemAoBSaplings extends ItemBlockWithMetadata{

	final static String [] saplings = new String [] {"pine", "pine2", "olive"};

	
	public ItemAoBSaplings(Block block) {
		super(block, block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= saplings.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + saplings[i];
	}
	public int getMetadata(int meta) {
		return meta;
	}

}
