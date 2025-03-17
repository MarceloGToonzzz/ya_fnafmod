package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.WitheredFreddyBlockTileEntity;

public class WitheredFreddyBlockBlockModel extends GeoModel<WitheredFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/withered_freddyfazbear.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/withered_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/withered_freddyfazbear.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/withered_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_freddy_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_freddy.png");
	}
}
