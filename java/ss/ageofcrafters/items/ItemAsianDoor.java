package ss.ageofcrafters.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import ss.ageofcrafters.main.AgeOfCrafters;
import ss.ageofcrafters.main.AgeOfCraftersBlocks;

public class ItemAsianDoor extends Item
{
    private Material doorMaterial;

    public ItemAsianDoor(Material material)
    {
        this.doorMaterial = material;
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabRedstone);
        this.setTextureName(AgeOfCrafters.modid + ":" + "AsianDoor");
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        if (side != 1)
        {
            return false;
        }
        else
        {
            ++y;
            Block block;

            block = AgeOfCraftersBlocks.AsianDoor;         

            if (player.canPlayerEdit(x, y, z, side, itemstack) && player.canPlayerEdit(x, y + 1, z, side, itemstack))
            {
                if (!block.canPlaceBlockAt(world, x, y, z))
                {
                    return false;
                }
                else
                {
                    int i1 = MathHelper.floor_double((double)((player.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                    placeDoorBlock(world, x, y, z, i1, block);
                    --itemstack.stackSize;
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }

    public static void placeDoorBlock(World world, int x, int y, int z, int side, Block block)
    {
        byte b0 = 0;
        byte b1 = 0;

        if (side == 0)
        {
            b1 = 1;
        }

        if (side == 1)
        {
            b0 = -1;
        }

        if (side == 2)
        {
            b1 = -1;
        }

        if (side == 3)
        {
            b0 = 1;
        }

        int i1 = (world.getBlock(x - b0, y, z - b1).isNormalCube() ? 1 : 0) + (world.getBlock(x - b0, y + 1, z - b1).isNormalCube() ? 1 : 0);
        int j1 = (world.getBlock(x + b0, y, z + b1).isNormalCube() ? 1 : 0) + (world.getBlock(x + b0, y + 1, z + b1).isNormalCube() ? 1 : 0);
        boolean flag = world.getBlock(x - b0, y, z - b1) == block || world.getBlock(x - b0, y + 1, z - b1) == block;
        boolean flag1 = world.getBlock(x + b0, y, z + b1) == block || world.getBlock(x + b0, y + 1, z + b1) == block;
        boolean flag2 = false;

        if (flag && !flag1)
        {
            flag2 = true;
        }
        else if (j1 > i1)
        {
            flag2 = true;
        }

        world.setBlock(x, y, z, block, side, 2);
        world.setBlock(x, y + 1, z, block, 8 | (flag2 ? 1 : 0), 2);
        world.notifyBlocksOfNeighborChange(x, y, z, block);
        world.notifyBlocksOfNeighborChange(x, y + 1, z, block);
    }
}