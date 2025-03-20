package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigElevatorDoorDisplayItem;

public class BigElevatorDoorDisplayModel extends GeoModel<BigElevatorDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigElevatorDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigelevatordoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigElevatorDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigelevatordoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigElevatorDoorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigelevatordoor.png");
	}
}
