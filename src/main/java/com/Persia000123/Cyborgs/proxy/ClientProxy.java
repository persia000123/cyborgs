package com.Persia000123.Cyborgs.proxy;

import com.Persia000123.Cyborgs.render.RenderCyborgsMod;
import com.Persia000123.Cyborgs.world.entity.EntityCyborgsMod;
import cpw.mods.fml.client.registry.RenderingRegistry;


public class ClientProxy extends CommonProxy
{
    public void registerRenderThings()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityCyborgsMod.class, new RenderCyborgsMod());
    }
}
