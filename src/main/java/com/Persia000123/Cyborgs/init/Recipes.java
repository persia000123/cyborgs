package com.Persia000123.Cyborgs.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.kyaniteblock), "ss", "ss", 's', new ItemStack(ModItems.kyanite));
    }
}
