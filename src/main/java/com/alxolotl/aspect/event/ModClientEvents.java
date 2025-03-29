package com.alxolotl.aspect.event;

import com.alxolotl.aspect.AspectsOfMinecraft;
import com.alxolotl.aspect.entity.client.MammotitanModel;
import com.alxolotl.aspect.entity.layers.ModelLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AspectsOfMinecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){

        event.registerLayerDefinition(ModelLayer.MAMMOTITAN, MammotitanModel::createBodyLayer);

    }
}
