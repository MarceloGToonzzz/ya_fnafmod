package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.LaptopOldDisplayItem;

public class LaptopOldDisplayModel extends GeoModel<LaptopOldDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LaptopOldDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/laptop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LaptopOldDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/laptop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LaptopOldDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/laptop_old.png");
	}
}
