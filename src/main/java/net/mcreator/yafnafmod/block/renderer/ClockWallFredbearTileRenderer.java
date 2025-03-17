package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallFredbearBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallFredbearTileEntity;

public class ClockWallFredbearTileRenderer extends GeoBlockRenderer<ClockWallFredbearTileEntity> {
	public ClockWallFredbearTileRenderer() {
		super(new ClockWallFredbearBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallFredbearTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
