package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToyBonnieBlockDisplayItem;

public class ToyBonnieBlockDisplayModel extends GeoModel<ToyBonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tbonnie_day.png");
	}
}
