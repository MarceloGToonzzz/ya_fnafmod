package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DeluxeBallpitDisplayItem;

public class DeluxeBallpitDisplayModel extends GeoModel<DeluxeBallpitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeBallpitDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/deluxe_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeBallpitDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/deluxe_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeBallpitDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/deluxe_ballpit.png");
	}
}
