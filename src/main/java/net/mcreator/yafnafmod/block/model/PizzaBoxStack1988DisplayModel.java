package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBoxStack1988DisplayItem;

public class PizzaBoxStack1988DisplayModel extends GeoModel<PizzaBoxStack1988DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBoxStack1988DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBoxStack1988DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBoxStack1988DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1988.png");
	}
}
