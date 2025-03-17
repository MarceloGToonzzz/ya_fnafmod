package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DeluxeSpeakerTileEntity;

public class DeluxeSpeakerBlockModel extends GeoModel<DeluxeSpeakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/speaker_deluxe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/speaker_deluxe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/speaker_deluxe.png");
	}
}
