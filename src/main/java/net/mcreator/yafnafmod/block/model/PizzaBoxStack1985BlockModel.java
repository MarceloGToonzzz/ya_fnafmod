package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1985TileEntity;

public class PizzaBoxStack1985BlockModel extends GeoModel<PizzaBoxStack1985TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBoxStack1985TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBoxStack1985TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBoxStack1985TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1985.png");
	}
}
