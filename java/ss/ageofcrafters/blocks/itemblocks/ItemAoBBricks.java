package ss.ageofcrafters.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemAoBBricks extends ItemBlock{

	final static String [] subBlocks = new String [] {"sandstone", "ender", "lapis", "obsidian", "quartz", "ancient", "dirt", "smoothstone", "snow", "ziggurat", "jade"};

	
	public ItemAoBBricks(Block block) {
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
