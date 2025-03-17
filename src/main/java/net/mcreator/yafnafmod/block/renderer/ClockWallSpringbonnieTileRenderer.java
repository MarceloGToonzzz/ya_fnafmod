package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallSpringbonnieBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallSpringbonnieTileEntity;

public class ClockWallSpringbonnieTileRenderer extends GeoBlockRenderer<ClockWallSpringbonnieTileEntity> {
	public ClockWallSpringbonnieTileRenderer() {
		super(new ClockWallSpringbonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallSpringbonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
