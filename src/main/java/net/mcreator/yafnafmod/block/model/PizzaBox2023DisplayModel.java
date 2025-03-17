package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBox2023DisplayItem;

public class PizzaBox2023DisplayModel extends GeoModel<PizzaBox2023DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox2023DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox2023DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox2023DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_2023.png");
	}
}
