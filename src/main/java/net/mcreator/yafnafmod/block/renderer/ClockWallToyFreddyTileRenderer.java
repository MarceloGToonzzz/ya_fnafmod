package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallToyFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallToyFreddyTileEntity;

public class ClockWallToyFreddyTileRenderer extends GeoBlockRenderer<ClockWallToyFreddyTileEntity> {
	public ClockWallToyFreddyTileRenderer() {
		super(new ClockWallToyFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallToyFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
