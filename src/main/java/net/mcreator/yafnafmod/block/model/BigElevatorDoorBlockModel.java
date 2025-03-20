package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BigElevatorDoorTileEntity;

public class BigElevatorDoorBlockModel extends GeoModel<BigElevatorDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigElevatorDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bigelevatordoor_open.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bigelevatordoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigElevatorDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bigelevatordoor_open.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bigelevatordoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigElevatorDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/bigelevatordoor.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/bigelevatordoor.png");
	}
}
