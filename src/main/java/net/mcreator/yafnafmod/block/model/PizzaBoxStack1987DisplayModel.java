package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBoxStack1987DisplayItem;

public class PizzaBoxStack1987DisplayModel extends GeoModel<PizzaBoxStack1987DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBoxStack1987DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBoxStack1987DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBoxStack1987DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1987.png");
	}
}
