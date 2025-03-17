package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeactivatedBabyBlockModel;
import net.mcreator.yafnafmod.block.entity.DeactivatedBabyTileEntity;

public class DeactivatedBabyTileRenderer extends GeoBlockRenderer<DeactivatedBabyTileEntity> {
	public DeactivatedBabyTileRenderer() {
		super(new DeactivatedBabyBlockModel());
	}

	@Override
	public RenderType getRenderType(DeactivatedBabyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
