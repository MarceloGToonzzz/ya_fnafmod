package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.BonnieFaceMaskItem;

public class BonnieFaceMaskModel extends GeoModel<BonnieFaceMaskItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mask_retrobonnie.png");
	}
}
