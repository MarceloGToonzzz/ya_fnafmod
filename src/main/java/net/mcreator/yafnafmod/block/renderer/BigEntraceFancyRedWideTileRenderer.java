package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntraceFancyRedWideBlockModel;
import net.mcreator.yafnafmod.block.entity.BigEntraceFancyRedWideTileEntity;

public class BigEntraceFancyRedWideTileRenderer extends GeoBlockRenderer<BigEntraceFancyRedWideTileEntity> {
	public BigEntraceFancyRedWideTileRenderer() {
		super(new BigEntraceFancyRedWideBlockModel());
	}

	@Override
	public RenderType getRenderType(BigEntraceFancyRedWideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
