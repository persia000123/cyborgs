package com.Persia000123.Cyborgs.init;

import com.Persia000123.Cyborgs.item.*;
import com.Persia000123.Cyborgs.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCyborgs artificialSkin = new ItemArtificialSkin();
    public static final ItemSilicon silicon = new ItemSilicon();
    public static final ItemPurifiedSilicon purifiedsilicon= new ItemPurifiedSilicon();
    public static final ItemKyanite kyanite= new ItemKyanite();

    public static void init()
    {
        GameRegistry.registerItem(artificialSkin, "artificialSkin");
        GameRegistry.registerItem(silicon, "silicon");
        GameRegistry.registerItem(purifiedsilicon, "purifiedsilicon");
        GameRegistry.registerItem(kyanite, "kyanite");

    }
}
