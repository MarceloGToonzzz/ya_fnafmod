package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.LadderTowerTileEntity;

public class LadderTowerBlockModel extends GeoModel<LadderTowerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LadderTowerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/tower_ladder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LadderTowerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/tower_ladder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LadderTowerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/tower_ladder.png");
	}
}
