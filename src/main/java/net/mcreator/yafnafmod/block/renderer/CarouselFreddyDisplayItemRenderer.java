package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselFreddyDisplayModel;
import net.mcreator.yafnafmod.block.display.CarouselFreddyDisplayItem;

public class CarouselFreddyDisplayItemRenderer extends GeoItemRenderer<CarouselFreddyDisplayItem> {
	public CarouselFreddyDisplayItemRenderer() {
		super(new CarouselFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarouselFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
