package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SkeeballPizzarollerTileEntity;

public class SkeeballPizzarollerBlockModel extends GeoModel<SkeeballPizzarollerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkeeballPizzarollerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/skeeball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeballPizzarollerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/skeeball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeballPizzarollerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/skeeball_pizzaroller.png");
	}
}
