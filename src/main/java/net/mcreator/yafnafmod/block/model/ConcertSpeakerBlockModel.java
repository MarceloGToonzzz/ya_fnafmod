package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ConcertSpeakerTileEntity;

public class ConcertSpeakerBlockModel extends GeoModel<ConcertSpeakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ConcertSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/speaker_concert.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConcertSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/speaker_concert.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConcertSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/speaker_concert.png");
	}
}
