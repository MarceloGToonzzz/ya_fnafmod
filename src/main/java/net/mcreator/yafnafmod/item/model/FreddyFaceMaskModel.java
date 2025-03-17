package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.FreddyFaceMaskItem;

public class FreddyFaceMaskModel extends GeoModel<FreddyFaceMaskItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/mask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFaceMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/mask_retrofreddy.png");
	}
}
