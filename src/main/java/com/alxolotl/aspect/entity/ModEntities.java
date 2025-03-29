package com.alxolotl.aspect.entity;

import com.alxolotl.aspect.AspectsOfMinecraft;
import com.alxolotl.aspect.entity.custom.MammotitanEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AspectsOfMinecraft.MODID);

    public static final RegistryObject<EntityType<MammotitanEntity>> MAMMOTITAN =
            ENTITY_TYPE.register("mammotitan", ()-> EntityType.Builder
                    .of(MammotitanEntity::new, MobCategory.CREATURE).sized(7.0f, 7.0f).build("mammotitan"));


    public static void register(IEventBus eventBus){
        ENTITY_TYPE.register(eventBus);

    }


}
