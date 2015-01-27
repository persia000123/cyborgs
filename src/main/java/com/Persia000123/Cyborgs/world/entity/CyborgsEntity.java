package com.Persia000123.Cyborgs.world.entity;

import com.Persia000123.Cyborgs.reference.Reference;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class CyborgsEntity {

    public static void inti()
    {
        registerEntity();
    }
    public static void registerEntity()
    {
        createEntity(EntityCyborgsMod.class,"Cyborg", 0xB5B5B5 ,0x030303);
    }
    public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour)
    {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, Reference.MOD_ID, 64, 1,true);
        crateEgg(randomId, solidColour, spotColour);
    }

    private static void crateEgg(int randomId, int solidColour, int spotColour)
    {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour ,spotColour));
    }
}
