package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.WitheredDougDogBlockTileEntity;

public class WitheredDougDogBlockBlockModel extends GeoModel<WitheredDougDogBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredDougDogBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/dougthedog.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/dougthedog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredDougDogBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/dougthedog.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/dougthedog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredDougDogBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_doug_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_doug.png");
	}
}
