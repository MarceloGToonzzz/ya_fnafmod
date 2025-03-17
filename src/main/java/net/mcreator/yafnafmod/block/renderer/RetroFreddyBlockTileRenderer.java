package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroFreddyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RetroFreddyBlockTileEntity;

public class RetroFreddyBlockTileRenderer extends GeoBlockRenderer<RetroFreddyBlockTileEntity> {
	public RetroFreddyBlockTileRenderer() {
		super(new RetroFreddyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
