package ss.ageofcrafters.blocks.itemblocks;

import java.util.List;

import ss.ageofcrafters.main.AgeOfCraftersBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
public class ItemQuartzSlab extends ItemSlab
{
    public ItemQuartzSlab(Block block)
    {
	    super(block, (BlockSlab)AgeOfCraftersBlocks.QuartzHalfSlab, (BlockSlab)AgeOfCraftersBlocks.QuartzDoubleSlab, false);
	    this.setMaxDamage(0);
	    this.setHasSubtypes(true);
    }
    



}