package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BoxEndoTileEntity;

public class BoxEndoBlockModel extends GeoModel<BoxEndoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxEndoTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_endo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxEndoTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_endo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxEndoTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_endo.png");
	}
}
