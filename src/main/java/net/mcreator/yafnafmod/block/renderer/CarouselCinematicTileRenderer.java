package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselCinematicBlockModel;
import net.mcreator.yafnafmod.block.entity.CarouselCinematicTileEntity;

public class CarouselCinematicTileRenderer extends GeoBlockRenderer<CarouselCinematicTileEntity> {
	public CarouselCinematicTileRenderer() {
		super(new CarouselCinematicBlockModel());
	}

	@Override
	public RenderType getRenderType(CarouselCinematicTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
