package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroFreddyHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.RetroFreddyHeadTileEntity;

public class RetroFreddyHeadTileRenderer extends GeoBlockRenderer<RetroFreddyHeadTileEntity> {
	public RetroFreddyHeadTileRenderer() {
		super(new RetroFreddyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddyHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
