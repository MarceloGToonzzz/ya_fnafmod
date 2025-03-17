
package net.mcreator.yafnafmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.entity.model.PhantomFoxyModel;
import net.mcreator.yafnafmod.entity.layer.PhantomFoxyLayer;
import net.mcreator.yafnafmod.entity.PhantomFoxyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PhantomFoxyRenderer extends GeoEntityRenderer<PhantomFoxyEntity> {
	public PhantomFoxyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PhantomFoxyModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new PhantomFoxyLayer(this));
	}

	@Override
	public RenderType getRenderType(PhantomFoxyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PhantomFoxyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
