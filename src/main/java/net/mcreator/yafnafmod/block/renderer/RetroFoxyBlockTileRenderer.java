package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroFoxyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RetroFoxyBlockTileEntity;

public class RetroFoxyBlockTileRenderer extends GeoBlockRenderer<RetroFoxyBlockTileEntity> {
	public RetroFoxyBlockTileRenderer() {
		super(new RetroFoxyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RetroFoxyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
