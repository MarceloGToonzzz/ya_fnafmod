package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BaggieMaggieBlockDisplayItem;

public class BaggieMaggieBlockDisplayModel extends GeoModel<BaggieMaggieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BaggieMaggieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashbag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaggieMaggieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashbag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaggieMaggieBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_baggiemaggie.png");
	}
}
