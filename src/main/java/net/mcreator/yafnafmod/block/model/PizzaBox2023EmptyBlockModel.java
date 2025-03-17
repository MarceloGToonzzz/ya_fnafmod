package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzaBox2023EmptyTileEntity;

public class PizzaBox2023EmptyBlockModel extends GeoModel<PizzaBox2023EmptyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox2023EmptyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/pizzabox_open.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox2023EmptyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/pizzabox_open.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox2023EmptyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_2023_empty.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_2023_empty.png");
	}
}
