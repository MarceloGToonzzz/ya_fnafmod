package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallChicaBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallChicaTileEntity;

public class ClockWallChicaTileRenderer extends GeoBlockRenderer<ClockWallChicaTileEntity> {
	public ClockWallChicaTileRenderer() {
		super(new ClockWallChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
