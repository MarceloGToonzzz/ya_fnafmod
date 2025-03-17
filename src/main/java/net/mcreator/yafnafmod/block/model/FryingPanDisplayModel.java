package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FryingPanDisplayItem;

public class FryingPanDisplayModel extends GeoModel<FryingPanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FryingPanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fryingpan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FryingPanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fryingpan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FryingPanDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fryingpan.png");
	}
}
