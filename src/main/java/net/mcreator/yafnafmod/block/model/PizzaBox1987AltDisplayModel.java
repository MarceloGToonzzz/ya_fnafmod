package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzaBox1987AltDisplayItem;

public class PizzaBox1987AltDisplayModel extends GeoModel<PizzaBox1987AltDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox1987AltDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox1987AltDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox1987AltDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1987alt.png");
	}
}
