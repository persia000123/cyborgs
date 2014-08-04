package com.Persia000123.Cyborgs.handler;

import com.Persia000123.Cyborgs.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            lodeConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            lodeConfiguration();
        }
    }

    private static void lodeConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example Configuration value");

                if (configuration.hasChanged())
                {
                    configuration.save();
                }
    }
}
