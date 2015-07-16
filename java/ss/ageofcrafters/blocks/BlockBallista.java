package ss.ageofcrafters.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ss.ageofcrafters.blocks.tileentities.TileEntityBallista;
import ss.ageofcrafters.units.EntityClubman;

public class BlockBallista extends BlockContainer
{
	public BlockBallista(Material material) {
		super(material);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBallista();
	}
   
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (!world.isRemote)
        {
        	world.spawnEntityInWorld(new EntityArrow(world));
        }    		
    	
        return true;
    }
}