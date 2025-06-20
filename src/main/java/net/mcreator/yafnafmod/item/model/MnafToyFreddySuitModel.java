package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafToyFreddySuitItem;

public class MnafToyFreddySuitModel extends GeoModel<MnafToyFreddySuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafToyFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_toyfreddysuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafToyFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_toyfreddysuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafToyFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_toyfreddysuit.png");
	}
}
