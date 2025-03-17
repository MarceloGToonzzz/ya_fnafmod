package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CameraTileEntity;

public class CameraBlockModel extends GeoModel<CameraTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CameraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/camera.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CameraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/camera.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CameraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/camera.png");
	}
}
