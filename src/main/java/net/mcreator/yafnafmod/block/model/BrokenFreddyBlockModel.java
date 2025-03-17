package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BrokenFreddyTileEntity;

public class BrokenFreddyBlockModel extends GeoModel<BrokenFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFreddyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/broken_freddy.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/broken_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFreddyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/broken_freddy.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/broken_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFreddyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/broken_freddy_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_freddy.png");
	}
}
