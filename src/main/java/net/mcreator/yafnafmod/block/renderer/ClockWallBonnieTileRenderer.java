package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallBonnieBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallBonnieTileEntity;

public class ClockWallBonnieTileRenderer extends GeoBlockRenderer<ClockWallBonnieTileEntity> {
	public ClockWallBonnieTileRenderer() {
		super(new ClockWallBonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
