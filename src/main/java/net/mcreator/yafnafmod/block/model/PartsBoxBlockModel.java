package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PartsBoxTileEntity;

public class PartsBoxBlockModel extends GeoModel<PartsBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PartsBoxTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/partsbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PartsBoxTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/partsbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PartsBoxTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/partsbox.png");
	}
}
