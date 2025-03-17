package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinTheBowtieFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.PinTheBowtieFreddyTileEntity;

public class PinTheBowtieFreddyTileRenderer extends GeoBlockRenderer<PinTheBowtieFreddyTileEntity> {
	public PinTheBowtieFreddyTileRenderer() {
		super(new PinTheBowtieFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(PinTheBowtieFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
