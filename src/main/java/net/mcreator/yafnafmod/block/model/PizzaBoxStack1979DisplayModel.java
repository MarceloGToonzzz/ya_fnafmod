package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBoxStack1979DisplayItem;

public class PizzaBoxStack1979DisplayModel extends GeoModel<PizzaBoxStack1979DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBoxStack1979DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBoxStack1979DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBoxStack1979DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1979.png");
	}
}
