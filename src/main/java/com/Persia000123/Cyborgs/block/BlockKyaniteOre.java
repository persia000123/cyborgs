package com.Persia000123.Cyborgs.block;

import com.Persia000123.Cyborgs.init.ModItems;
import com.Persia000123.Cyborgs.item.ItemKyanite;
import net.minecraft.block.material.Material;


import java.util.Random;


public class BlockKyaniteOre extends BlockCyborgs
{
    public BlockKyaniteOre ()
    {
        super(Material.iron);
        this.setBlockName("kyaniteore");
        setHardness(3.0f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 2);
    }

    public int quantityDropped(Random p_149745_1_)
    {
        return 2 + p_149745_1_.nextInt(3);
    }
    @Override
    public ItemKyanite getItemDropped(int par1, Random random, int par2)
    {
        return ModItems.kyanite;
    }

}
