package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallToyFoxyBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallToyFoxyTileEntity;

public class ClockWallToyFoxyTileRenderer extends GeoBlockRenderer<ClockWallToyFoxyTileEntity> {
	public ClockWallToyFoxyTileRenderer() {
		super(new ClockWallToyFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallToyFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
