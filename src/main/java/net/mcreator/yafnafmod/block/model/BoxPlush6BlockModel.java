package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BoxPlush6TileEntity;

public class BoxPlush6BlockModel extends GeoModel<BoxPlush6TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush6TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush6TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush6TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush6.png");
	}
}
