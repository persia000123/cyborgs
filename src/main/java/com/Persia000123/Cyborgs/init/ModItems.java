package com.Persia000123.Cyborgs.init;

import com.Persia000123.Cyborgs.item.ItemArtificialSkin;
import com.Persia000123.Cyborgs.item.ItemCyborgs;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemCyborgs artificialskin = new ItemArtificialSkin();

    public static void init()
    {
        GameRegistry.registerItem(artificialskin, "artificialskin");
    }
}
