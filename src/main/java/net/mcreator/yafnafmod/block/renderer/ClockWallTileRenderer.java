package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallTileEntity;

public class ClockWallTileRenderer extends GeoBlockRenderer<ClockWallTileEntity> {
	public ClockWallTileRenderer() {
		super(new ClockWallBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
