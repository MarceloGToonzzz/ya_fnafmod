package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarStationWagonBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CarStationWagonBlockDisplayItem;

public class CarStationWagonBlockDisplayItemRenderer extends GeoItemRenderer<CarStationWagonBlockDisplayItem> {
	public CarStationWagonBlockDisplayItemRenderer() {
		super(new CarStationWagonBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarStationWagonBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
