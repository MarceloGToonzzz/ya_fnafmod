package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FuntimeFreddyBlockTileEntity;

public class FuntimeFreddyBlockBlockModel extends GeoModel<FuntimeFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/funtime_freddy.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/funtime_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/funtime_freddy.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/funtime_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftfreddy_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftfreddy.png");
	}
}
