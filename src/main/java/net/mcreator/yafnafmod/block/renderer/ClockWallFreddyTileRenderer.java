package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallFreddyTileEntity;

public class ClockWallFreddyTileRenderer extends GeoBlockRenderer<ClockWallFreddyTileEntity> {
	public ClockWallFreddyTileRenderer() {
		super(new ClockWallFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
