package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroChicaHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.RetroChicaHeadTileEntity;

public class RetroChicaHeadTileRenderer extends GeoBlockRenderer<RetroChicaHeadTileEntity> {
	public RetroChicaHeadTileRenderer() {
		super(new RetroChicaHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroChicaHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
