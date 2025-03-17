package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToypugTileEntity;

public class ToypugBlockModel extends GeoModel<ToypugTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToypugTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toypug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToypugTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toypug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToypugTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/toypug.png");
	}
}
