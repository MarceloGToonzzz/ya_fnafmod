package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBox1987EmptyDisplayItem;

public class PizzaBox1987EmptyDisplayModel extends GeoModel<PizzaBox1987EmptyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox1987EmptyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox1987EmptyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox1987EmptyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1987_empty.png");
	}
}
