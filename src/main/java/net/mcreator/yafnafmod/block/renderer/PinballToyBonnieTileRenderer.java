package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinballToyBonnieBlockModel;
import net.mcreator.yafnafmod.block.entity.PinballToyBonnieTileEntity;

public class PinballToyBonnieTileRenderer extends GeoBlockRenderer<PinballToyBonnieTileEntity> {
	public PinballToyBonnieTileRenderer() {
		super(new PinballToyBonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(PinballToyBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
