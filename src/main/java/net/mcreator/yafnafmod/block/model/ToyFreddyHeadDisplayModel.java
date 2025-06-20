package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToyFreddyHeadDisplayItem;

public class ToyFreddyHeadDisplayModel extends GeoModel<ToyFreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_freddytoy.png");
	}
}
