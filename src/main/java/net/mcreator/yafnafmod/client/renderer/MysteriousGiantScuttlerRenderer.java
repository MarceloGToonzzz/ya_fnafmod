
package net.mcreator.yafnafmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.entity.model.MysteriousGiantScuttlerModel;
import net.mcreator.yafnafmod.entity.MysteriousGiantScuttlerEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MysteriousGiantScuttlerRenderer extends GeoEntityRenderer<MysteriousGiantScuttlerEntity> {
	public MysteriousGiantScuttlerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MysteriousGiantScuttlerModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(MysteriousGiantScuttlerEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
		public void preRender(PoseStack poseStack, MysteriousGiantScuttlerEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {

			if(entity.isBaby()) {
			poseStack.scale (0.75f, 0.75f, 0.75f);
			} else {
			poseStack.scale (1.0f, 1.0f, 1.0f);
			}
	}
}
