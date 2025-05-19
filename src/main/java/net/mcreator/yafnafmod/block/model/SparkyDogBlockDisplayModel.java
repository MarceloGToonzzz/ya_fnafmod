package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SparkyDogBlockDisplayItem;

public class SparkyDogBlockDisplayModel extends GeoModel<SparkyDogBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SparkyDogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/sparky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SparkyDogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/sparky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SparkyDogBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_sparky.png");
	}
}
