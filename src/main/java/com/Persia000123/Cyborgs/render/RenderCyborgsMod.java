package com.Persia000123.Cyborgs.render;

import com.Persia000123.Cyborgs.world.entity.EntityCyborgsMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderCyborgsMod extends RenderLiving
{
    private static final ResourceLocation mobTextures = new ResourceLocation("textures/entity/cow/cow.png");
    private static final String __OBFID = "CL_00000984";

    public RenderCyborgsMod(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityCyborgsMod p_110775_1_)
    {
        return mobTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityCyborgsMod)p_110775_1_);
    }
}