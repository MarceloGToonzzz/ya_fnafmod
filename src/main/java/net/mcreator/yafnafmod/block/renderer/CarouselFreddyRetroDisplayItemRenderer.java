package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselFreddyRetroDisplayModel;
import net.mcreator.yafnafmod.block.display.CarouselFreddyRetroDisplayItem;

public class CarouselFreddyRetroDisplayItemRenderer extends GeoItemRenderer<CarouselFreddyRetroDisplayItem> {
	public CarouselFreddyRetroDisplayItemRenderer() {
		super(new CarouselFreddyRetroDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarouselFreddyRetroDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
