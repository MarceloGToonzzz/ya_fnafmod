package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Bobbleheads2TileEntity;

public class Bobbleheads2BlockModel extends GeoModel<Bobbleheads2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Bobbleheads2TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bobbleheads_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Bobbleheads2TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bobbleheads_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Bobbleheads2TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bobbleheads_toyfredbonchi.png");
	}
}
