package com.Persia000123.Cyborgs.proxy;

import com.Persia000123.Cyborgs.render.RenderCyborgsMod;
import com.Persia000123.Cyborgs.world.entity.EntityCyborgsMod;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;


public class ClientProxy extends CommonProxy
{
    public void registerRenderThings()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityCyborgsMod.class, new RenderCyborgsMod(new ModelBiped(), 0));
    }
}
