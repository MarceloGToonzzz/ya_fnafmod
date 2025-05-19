package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ScrapSparkyDogBlockDisplayItem;

public class ScrapSparkyDogBlockDisplayModel extends GeoModel<ScrapSparkyDogBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ScrapSparkyDogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/sparky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapSparkyDogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/sparky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapSparkyDogBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_sparky_scrap.png");
	}
}
