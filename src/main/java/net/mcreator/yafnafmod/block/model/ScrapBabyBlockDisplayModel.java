package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ScrapBabyBlockDisplayItem;

public class ScrapBabyBlockDisplayModel extends GeoModel<ScrapBabyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ScrapBabyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/scrap_baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapBabyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/scrap_baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapBabyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_scrap_baby.png");
	}
}
