package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.WitheredFoxyBlockTileEntity;

public class WitheredFoxyBlockBlockModel extends GeoModel<WitheredFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/withered_foxy.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/withered_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/withered_foxy.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/withered_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_foxy_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_foxy.png");
	}
}
