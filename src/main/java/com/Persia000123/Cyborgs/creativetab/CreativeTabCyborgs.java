package com.Persia000123.Cyborgs.creativetab;

import com.Persia000123.Cyborgs.init.ModItems;
import com.Persia000123.Cyborgs.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCyborgs
{
    public static final CreativeTabs Cyborgs_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.artificialSkin;
        }
    };
}
