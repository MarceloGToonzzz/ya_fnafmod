package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinballToyFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.PinballToyFreddyTileEntity;

public class PinballToyFreddyTileRenderer extends GeoBlockRenderer<PinballToyFreddyTileEntity> {
	public PinballToyFreddyTileRenderer() {
		super(new PinballToyFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(PinballToyFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
