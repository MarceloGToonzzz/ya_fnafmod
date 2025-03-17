package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallFoxyBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallFoxyTileEntity;

public class ClockWallFoxyTileRenderer extends GeoBlockRenderer<ClockWallFoxyTileEntity> {
	public ClockWallFoxyTileRenderer() {
		super(new ClockWallFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
