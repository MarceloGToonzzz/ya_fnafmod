package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroFoxyHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.RetroFoxyHeadTileEntity;

public class RetroFoxyHeadTileRenderer extends GeoBlockRenderer<RetroFoxyHeadTileEntity> {
	public RetroFoxyHeadTileRenderer() {
		super(new RetroFoxyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroFoxyHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
