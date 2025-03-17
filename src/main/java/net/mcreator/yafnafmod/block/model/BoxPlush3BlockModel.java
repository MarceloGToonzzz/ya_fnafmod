package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BoxPlush3TileEntity;

public class BoxPlush3BlockModel extends GeoModel<BoxPlush3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlush3TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlush3TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlush3TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plush3.png");
	}
}
