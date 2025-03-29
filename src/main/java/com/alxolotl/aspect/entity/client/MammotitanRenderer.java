package com.alxolotl.aspect.entity.client;

import com.alxolotl.aspect.AspectsOfMinecraft;
import com.alxolotl.aspect.entity.custom.MammotitanEntity;
import com.alxolotl.aspect.entity.layers.ModelLayer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MammotitanRenderer extends MobRenderer<MammotitanEntity,MammotitanModel<MammotitanEntity>> {
    public static final ResourceLocation MAMMOTITAN = new ResourceLocation(AspectsOfMinecraft.MODID, "textures/entity/mammotitan.png");

    public MammotitanRenderer(EntityRendererProvider.Context context ) {
        super(context,new MammotitanModel<>(context.bakeLayer(ModelLayer.MAMMOTITAN)), 2.0f );

        this.model=new MammotitanModel(context.bakeLayer(ModelLayer.MAMMOTITAN));

    }


    @Override
    public void render(MammotitanEntity p_115455_, float p_115456_, float p_115457_, PoseStack poseStack, MultiBufferSource p_115459_, int p_115460_) {
        poseStack.scale(1.0f, 1.0f, 1.0f);

        super.render(p_115455_, p_115456_, p_115457_, poseStack, p_115459_, p_115460_);
    }

    @Override
    public ResourceLocation getTextureLocation(MammotitanEntity mammotitanEntity) {
        return MAMMOTITAN;
    }
}
