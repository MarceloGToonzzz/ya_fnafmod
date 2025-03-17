package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ScooperTileEntity;

public class ScooperBlockModel extends GeoModel<ScooperTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScooperTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/scooper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScooperTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/scooper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScooperTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/scooper.png");
	}
}
