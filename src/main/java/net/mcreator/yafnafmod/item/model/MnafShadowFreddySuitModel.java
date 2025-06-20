package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.MnafShadowFreddySuitItem;

public class MnafShadowFreddySuitModel extends GeoModel<MnafShadowFreddySuitItem> {
	@Override
	public ResourceLocation getAnimationResource(MnafShadowFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mnaf_freddysuit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MnafShadowFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mnaf_freddysuit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MnafShadowFreddySuitItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mnaf_shadowfreddysuit.png");
	}
}
