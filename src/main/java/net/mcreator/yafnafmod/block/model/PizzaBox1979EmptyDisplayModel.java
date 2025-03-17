package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBox1979EmptyDisplayItem;

public class PizzaBox1979EmptyDisplayModel extends GeoModel<PizzaBox1979EmptyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox1979EmptyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox1979EmptyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox1979EmptyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1979_empty.png");
	}
}
