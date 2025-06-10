package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BarryPolarBlockTileEntity;

public class BarryPolarBlockBlockModel extends GeoModel<BarryPolarBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/barrypolar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/barrypolar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_barrypolar.png");
	}
}
