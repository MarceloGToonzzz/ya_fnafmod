package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.OrvilleElephantBlockTileEntity;

public class OrvilleElephantBlockBlockModel extends GeoModel<OrvilleElephantBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleElephantBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/orville_elephant.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleElephantBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/orville_elephant.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleElephantBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_orville_elephant.png");
	}
}
