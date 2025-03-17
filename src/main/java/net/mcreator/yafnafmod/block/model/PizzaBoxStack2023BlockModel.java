package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzaBoxStack2023TileEntity;

public class PizzaBoxStack2023BlockModel extends GeoModel<PizzaBoxStack2023TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBoxStack2023TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBoxStack2023TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBoxStack2023TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_2023.png");
	}
}
