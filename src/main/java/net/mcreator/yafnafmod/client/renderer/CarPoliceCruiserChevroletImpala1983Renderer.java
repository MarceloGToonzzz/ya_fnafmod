
package net.mcreator.yafnafmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.entity.model.CarPoliceCruiserChevroletImpala1983Model;
import net.mcreator.yafnafmod.entity.CarPoliceCruiserChevroletImpala1983Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CarPoliceCruiserChevroletImpala1983Renderer extends GeoEntityRenderer<CarPoliceCruiserChevroletImpala1983Entity> {
	public CarPoliceCruiserChevroletImpala1983Renderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CarPoliceCruiserChevroletImpala1983Model());
		this.shadowRadius = 0.8591666666f;
	}

	@Override
	public RenderType getRenderType(CarPoliceCruiserChevroletImpala1983Entity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, CarPoliceCruiserChevroletImpala1983Entity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
