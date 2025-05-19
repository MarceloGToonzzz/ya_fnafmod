package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BoxPlush5TileEntity;

public class BoxPlush5BlockModel extends GeoModel<BoxPlush5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush5TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush5TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush5TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush5.png");
	}
}
