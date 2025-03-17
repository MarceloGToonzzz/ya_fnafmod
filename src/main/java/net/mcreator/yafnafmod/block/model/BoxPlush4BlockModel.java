package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BoxPlush4TileEntity;

public class BoxPlush4BlockModel extends GeoModel<BoxPlush4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush4TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush4TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush4TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush4.png");
	}
}
