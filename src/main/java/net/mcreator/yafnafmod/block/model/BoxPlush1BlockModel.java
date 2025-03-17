package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BoxPlush1TileEntity;

public class BoxPlush1BlockModel extends GeoModel<BoxPlush1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush1TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush1TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush1TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush1.png");
	}
}
