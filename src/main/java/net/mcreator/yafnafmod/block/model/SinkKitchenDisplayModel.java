package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SinkKitchenDisplayItem;

public class SinkKitchenDisplayModel extends GeoModel<SinkKitchenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SinkKitchenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/kitchen_sink.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SinkKitchenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/kitchen_sink.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SinkKitchenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/sinkkitchen.png");
	}
}
