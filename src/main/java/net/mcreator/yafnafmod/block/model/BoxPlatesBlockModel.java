package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BoxPlatesTileEntity;

public class BoxPlatesBlockModel extends GeoModel<BoxPlatesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlatesTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plates.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlatesTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plates.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlatesTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plates.png");
	}
}
