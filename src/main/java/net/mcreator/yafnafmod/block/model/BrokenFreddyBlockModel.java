package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BrokenFreddyTileEntity;

public class BrokenFreddyBlockModel extends GeoModel<BrokenFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/broken_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/broken_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_freddy.png");
	}
}
