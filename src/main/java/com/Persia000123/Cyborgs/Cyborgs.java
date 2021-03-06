package com.Persia000123.Cyborgs;

import com.Persia000123.Cyborgs.handler.ConfigurationHandler;
import com.Persia000123.Cyborgs.init.ModBlocks;
import com.Persia000123.Cyborgs.init.ModItems;
import com.Persia000123.Cyborgs.init.Recipes;
import com.Persia000123.Cyborgs.proxy.IProxy;
import com.Persia000123.Cyborgs.reference.Reference;
import com.Persia000123.Cyborgs.utility.LogHelper;
import com.Persia000123.Cyborgs.world.entity.CyborgsEntity;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Cyborgs
{
    @Mod.Instance(Reference.MOD_ID)
    public static Cyborgs instancel;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();

        ModBlocks.init();

        CyborgsEntity.inti();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }

}
