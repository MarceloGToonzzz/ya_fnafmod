package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselCinematicDisplayModel;
import net.mcreator.yafnafmod.block.display.CarouselCinematicDisplayItem;

public class CarouselCinematicDisplayItemRenderer extends GeoItemRenderer<CarouselCinematicDisplayItem> {
	public CarouselCinematicDisplayItemRenderer() {
		super(new CarouselCinematicDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarouselCinematicDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
