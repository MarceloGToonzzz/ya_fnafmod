package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DuckPondTileEntity;

public class DuckPondBlockModel extends GeoModel<DuckPondTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DuckPondTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/duck_pond.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DuckPondTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/duck_pond.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DuckPondTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/duck_pond.png");
	}
}
