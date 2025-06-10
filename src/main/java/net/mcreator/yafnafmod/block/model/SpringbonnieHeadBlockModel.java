package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SpringbonnieHeadTileEntity;

public class SpringbonnieHeadBlockModel extends GeoModel<SpringbonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_springbonnie.png");
	}
}
