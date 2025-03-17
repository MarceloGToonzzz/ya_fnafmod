package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarFazvanBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CarFazvanBlockDisplayItem;

public class CarFazvanBlockDisplayItemRenderer extends GeoItemRenderer<CarFazvanBlockDisplayItem> {
	public CarFazvanBlockDisplayItemRenderer() {
		super(new CarFazvanBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarFazvanBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
