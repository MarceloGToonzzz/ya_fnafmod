package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FuntimeFreddyBlockTileEntity;

public class FuntimeFreddyBlockBlockModel extends GeoModel<FuntimeFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftfreddy.png");
	}
}
