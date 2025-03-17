package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.EmptyExoticButterBasketBlockModel;
import net.mcreator.yafnafmod.block.entity.EmptyExoticButterBasketTileEntity;

public class EmptyExoticButterBasketTileRenderer extends GeoBlockRenderer<EmptyExoticButterBasketTileEntity> {
	public EmptyExoticButterBasketTileRenderer() {
		super(new EmptyExoticButterBasketBlockModel());
	}

	@Override
	public RenderType getRenderType(EmptyExoticButterBasketTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
