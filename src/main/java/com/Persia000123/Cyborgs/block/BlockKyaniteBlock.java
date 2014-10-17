package com.Persia000123.Cyborgs.block;


import net.minecraft.block.material.Material;

public class BlockKyaniteBlock extends BlockCyborgs
{
    public BlockKyaniteBlock ()

    {
        super(Material.rock);
        this.setBlockName("kyaniteblock");
        getTextureName();
        setHardness(3.0f);
        setResistance(5.0f);
    }

}
