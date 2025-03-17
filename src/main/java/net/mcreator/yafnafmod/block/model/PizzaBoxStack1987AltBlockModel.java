package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1987AltTileEntity;

public class PizzaBoxStack1987AltBlockModel extends GeoModel<PizzaBoxStack1987AltTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBoxStack1987AltTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBoxStack1987AltTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBoxStack1987AltTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1987alt.png");
	}
}
