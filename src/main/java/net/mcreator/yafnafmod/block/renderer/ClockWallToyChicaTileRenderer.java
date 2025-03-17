package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallToyChicaBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallToyChicaTileEntity;

public class ClockWallToyChicaTileRenderer extends GeoBlockRenderer<ClockWallToyChicaTileEntity> {
	public ClockWallToyChicaTileRenderer() {
		super(new ClockWallToyChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallToyChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
