package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyFreddyBlockTileEntity;

public class ToyFreddyBlockBlockModel extends GeoModel<ToyFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tfreddy_day.png");
	}
}
