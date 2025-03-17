package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBoxStack2023DisplayItem;

public class PizzaBoxStack2023DisplayModel extends GeoModel<PizzaBoxStack2023DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBoxStack2023DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBoxStack2023DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBoxStack2023DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_2023.png");
	}
}
