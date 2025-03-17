package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarFazvanPropDisplayModel;
import net.mcreator.yafnafmod.block.display.CarFazvanPropDisplayItem;

public class CarFazvanPropDisplayItemRenderer extends GeoItemRenderer<CarFazvanPropDisplayItem> {
	public CarFazvanPropDisplayItemRenderer() {
		super(new CarFazvanPropDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarFazvanPropDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
