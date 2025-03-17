package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroChicaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RetroChicaBlockTileEntity;

public class RetroChicaBlockTileRenderer extends GeoBlockRenderer<RetroChicaBlockTileEntity> {
	public RetroChicaBlockTileRenderer() {
		super(new RetroChicaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroChicaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
