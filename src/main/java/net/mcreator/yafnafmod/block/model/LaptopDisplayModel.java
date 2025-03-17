package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.LaptopDisplayItem;

public class LaptopDisplayModel extends GeoModel<LaptopDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LaptopDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/laptop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LaptopDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/laptop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LaptopDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/laptop_new.png");
	}
}
