package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeFoosballTileEntity;

public class ArcadeFoosballBlockModel extends GeoModel<ArcadeFoosballTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeFoosballTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_foosball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeFoosballTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_foosball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeFoosballTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcade_foosball.png");
	}
}
