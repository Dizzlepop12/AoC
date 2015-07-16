package ss.ageofcrafters.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import ss.ageofcrafters.main.AgeOfCrafters;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAoCStairs extends BlockStairs {

	public BlockAoCStairs(Material p_i45394_1_, Block block, int metadata) {
		super(block, metadata);
		useNeighborBrightness = true;
	}
	
}
