package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ScooperDisplayItem;

public class ScooperDisplayModel extends GeoModel<ScooperDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ScooperDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/scooper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScooperDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/scooper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScooperDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/scooper.png");
	}
}
