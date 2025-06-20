package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafBurntFreddySuitItem;

public class MnafBurntFreddySuitModel extends GeoModel<MnafBurntFreddySuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafBurntFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_freddysuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafBurntFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_freddysuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafBurntFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_burntfreddysuit.png");
	}
}
