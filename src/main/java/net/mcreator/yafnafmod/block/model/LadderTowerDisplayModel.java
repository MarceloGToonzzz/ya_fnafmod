package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.LadderTowerDisplayItem;

public class LadderTowerDisplayModel extends GeoModel<LadderTowerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LadderTowerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/tower_ladder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LadderTowerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/tower_ladder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LadderTowerDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/tower_ladder.png");
	}
}
