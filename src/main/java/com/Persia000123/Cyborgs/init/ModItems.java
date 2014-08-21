package com.Persia000123.Cyborgs.init;

import com.Persia000123.Cyborgs.item.ItemArtificialSkin;
import com.Persia000123.Cyborgs.item.ItemCyborgs;
import com.Persia000123.Cyborgs.item.ItemPurifiedSilicon;
import com.Persia000123.Cyborgs.item.ItemSilicon;
import com.Persia000123.Cyborgs.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCyborgs artificialSkin = new ItemArtificialSkin();
    public static final ItemSilicon silicon = new ItemSilicon();
    public static final ItemPurifiedSilicon purifiedsilicon= new ItemPurifiedSilicon();

    public static void init()
    {
        GameRegistry.registerItem(artificialSkin, "artificialSkin");
        GameRegistry.registerItem(silicon, "silicon");
        GameRegistry.registerItem(purifiedsilicon, "purifiedsilicon");
    }
}
