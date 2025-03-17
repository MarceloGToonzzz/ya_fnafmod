package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BoxPlush2TileEntity;

public class BoxPlush2BlockModel extends GeoModel<BoxPlush2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush2TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush2TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush2TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush2.png");
	}
}
