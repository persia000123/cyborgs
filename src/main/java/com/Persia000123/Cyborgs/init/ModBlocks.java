package com.Persia000123.Cyborgs.init;

import com.Persia000123.Cyborgs.block.*;
import com.Persia000123.Cyborgs.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCyborgs purifier = new BlockPurifier();
    public static final BlockAssembler assembler = new BlockAssembler();
    public static final BlockKyaniteOre kyaniteore = new BlockKyaniteOre();
    public static final BlockSeparator separator = new BlockSeparator();

    public static void init()
    {
        GameRegistry.registerBlock(purifier, "purifier");
        GameRegistry.registerBlock(assembler, "assembler");
        GameRegistry.registerBlock(kyaniteore, "kyaniteore");
        GameRegistry.registerBlock(separator, "separator");
    }
}

