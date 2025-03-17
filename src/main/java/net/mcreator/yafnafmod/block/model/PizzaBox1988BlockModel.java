package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzaBox1988TileEntity;

public class PizzaBox1988BlockModel extends GeoModel<PizzaBox1988TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox1988TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/pizzabox_open.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/pizzabox_open.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox1988TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/pizzabox_open.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/pizzabox_open.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox1988TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1988.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1988_empty.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzabox_1988.png");
	}
}
