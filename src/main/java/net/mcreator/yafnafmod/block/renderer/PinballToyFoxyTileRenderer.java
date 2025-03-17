package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinballToyFoxyBlockModel;
import net.mcreator.yafnafmod.block.entity.PinballToyFoxyTileEntity;

public class PinballToyFoxyTileRenderer extends GeoBlockRenderer<PinballToyFoxyTileEntity> {
	public PinballToyFoxyTileRenderer() {
		super(new PinballToyFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(PinballToyFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
