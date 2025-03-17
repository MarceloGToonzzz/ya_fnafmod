package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBox1985EmptyDisplayItem;

public class PizzaBox1985EmptyDisplayModel extends GeoModel<PizzaBox1985EmptyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox1985EmptyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox1985EmptyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox1985EmptyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1985_empty.png");
	}
}
