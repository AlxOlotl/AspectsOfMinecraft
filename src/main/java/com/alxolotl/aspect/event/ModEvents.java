package com.alxolotl.aspect.event;

import com.alxolotl.aspect.AspectsOfMinecraft;
import com.alxolotl.aspect.entity.custom.MammotitanEntity;
import com.alxolotl.aspect.entity.ModEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AspectsOfMinecraft.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void registerAttributes (EntityAttributeCreationEvent event){event.put(ModEntities.MAMMOTITAN.get()
            , MammotitanEntity.createAttributes().build());

    }


}
