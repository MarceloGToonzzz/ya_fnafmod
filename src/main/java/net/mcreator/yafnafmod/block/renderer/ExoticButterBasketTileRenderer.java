package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ExoticButterBasketBlockModel;
import net.mcreator.yafnafmod.block.entity.ExoticButterBasketTileEntity;

public class ExoticButterBasketTileRenderer extends GeoBlockRenderer<ExoticButterBasketTileEntity> {
	public ExoticButterBasketTileRenderer() {
		super(new ExoticButterBasketBlockModel());
	}

	@Override
	public RenderType getRenderType(ExoticButterBasketTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
