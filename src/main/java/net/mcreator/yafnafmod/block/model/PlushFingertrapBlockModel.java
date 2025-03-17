package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PlushFingertrapTileEntity;

public class PlushFingertrapBlockModel extends GeoModel<PlushFingertrapTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlushFingertrapTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fingertrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlushFingertrapTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fingertrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlushFingertrapTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/plush_bonnie_fingertrap.png");
	}
}
