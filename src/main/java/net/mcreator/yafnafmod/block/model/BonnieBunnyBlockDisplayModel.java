package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BonnieBunnyBlockDisplayItem;

public class BonnieBunnyBlockDisplayModel extends GeoModel<BonnieBunnyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonniebunny.png");
	}
}
