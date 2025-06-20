package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToyBonnieHeadDisplayItem;

public class ToyBonnieHeadDisplayModel extends GeoModel<ToyBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_bonnietoy.png");
	}
}
