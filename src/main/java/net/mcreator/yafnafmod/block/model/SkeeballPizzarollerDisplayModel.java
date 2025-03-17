package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SkeeballPizzarollerDisplayItem;

public class SkeeballPizzarollerDisplayModel extends GeoModel<SkeeballPizzarollerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SkeeballPizzarollerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/skeeball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeballPizzarollerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/skeeball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeballPizzarollerDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/skeeball_pizzaroller.png");
	}
}
