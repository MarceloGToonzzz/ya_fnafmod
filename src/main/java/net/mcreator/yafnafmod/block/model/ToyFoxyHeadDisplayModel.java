package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToyFoxyHeadDisplayItem;

public class ToyFoxyHeadDisplayModel extends GeoModel<ToyFoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_foxytoy.png");
	}
}
