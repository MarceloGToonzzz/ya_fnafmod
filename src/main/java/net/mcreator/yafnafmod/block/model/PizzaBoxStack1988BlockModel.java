package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1988TileEntity;

public class PizzaBoxStack1988BlockModel extends GeoModel<PizzaBoxStack1988TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBoxStack1988TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBoxStack1988TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBoxStack1988TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1988.png");
	}
}
