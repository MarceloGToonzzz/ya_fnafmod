package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CameraDisplayItem;

public class CameraDisplayModel extends GeoModel<CameraDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CameraDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/camera.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CameraDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/camera.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CameraDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/camera.png");
	}
}
