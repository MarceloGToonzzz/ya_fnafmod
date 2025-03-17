package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.FreddyMaskItem;

public class FreddyMaskModel extends GeoModel<FreddyMaskItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/freddymask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/freddymask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/freddymask.png");
	}
}
