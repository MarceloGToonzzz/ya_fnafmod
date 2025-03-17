package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselFredbearDisplayModel;
import net.mcreator.yafnafmod.block.display.CarouselFredbearDisplayItem;

public class CarouselFredbearDisplayItemRenderer extends GeoItemRenderer<CarouselFredbearDisplayItem> {
	public CarouselFredbearDisplayItemRenderer() {
		super(new CarouselFredbearDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarouselFredbearDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
