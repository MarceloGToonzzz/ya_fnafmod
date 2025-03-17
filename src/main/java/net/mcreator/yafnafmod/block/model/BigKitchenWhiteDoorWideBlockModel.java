package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BigKitchenWhiteDoorWideTileEntity;

public class BigKitchenWhiteDoorWideBlockModel extends GeoModel<BigKitchenWhiteDoorWideTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigKitchenWhiteDoorWideTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bigwidedooropen.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/bigwidedooropenback.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bigwidedoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigKitchenWhiteDoorWideTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bigwidedooropen.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/bigwidedooropenback.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bigwidedoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigKitchenWhiteDoorWideTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_kitchendoor2_wide.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_kitchendoor2_wide.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_kitchendoor2_wide.png");
	}
}
