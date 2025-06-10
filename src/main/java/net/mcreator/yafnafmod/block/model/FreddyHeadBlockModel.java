package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FreddyHeadTileEntity;

public class FreddyHeadBlockModel extends GeoModel<FreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_freddyclassic.png");
	}
}
