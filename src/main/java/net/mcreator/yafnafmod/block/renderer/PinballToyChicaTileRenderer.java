package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinballToyChicaBlockModel;
import net.mcreator.yafnafmod.block.entity.PinballToyChicaTileEntity;

public class PinballToyChicaTileRenderer extends GeoBlockRenderer<PinballToyChicaTileEntity> {
	public PinballToyChicaTileRenderer() {
		super(new PinballToyChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(PinballToyChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
