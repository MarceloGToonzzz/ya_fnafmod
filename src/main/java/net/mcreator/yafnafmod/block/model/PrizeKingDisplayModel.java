package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PrizeKingDisplayItem;

public class PrizeKingDisplayModel extends GeoModel<PrizeKingDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PrizeKingDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/prize_king.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrizeKingDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/prize_king.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrizeKingDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/prize_king.png");
	}
}
