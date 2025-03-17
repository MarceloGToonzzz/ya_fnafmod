package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DiscountBallpitDisplayItem;

public class DiscountBallpitDisplayModel extends GeoModel<DiscountBallpitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DiscountBallpitDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/discount_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountBallpitDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/discount_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountBallpitDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/discount_ballpit.png");
	}
}
