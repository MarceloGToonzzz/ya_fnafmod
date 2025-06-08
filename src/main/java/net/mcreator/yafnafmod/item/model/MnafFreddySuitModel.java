package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafFreddySuitItem;

public class MnafFreddySuitModel extends GeoModel<MnafFreddySuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_freddysuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_freddysuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_freddysuit.png");
	}
}
