package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarDesotoBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CarDesotoBlockDisplayItem;

public class CarDesotoBlockDisplayItemRenderer extends GeoItemRenderer<CarDesotoBlockDisplayItem> {
	public CarDesotoBlockDisplayItemRenderer() {
		super(new CarDesotoBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarDesotoBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
