package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ConcertSpeakerDisplayItem;

public class ConcertSpeakerDisplayModel extends GeoModel<ConcertSpeakerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ConcertSpeakerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/speaker_concert.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConcertSpeakerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/speaker_concert.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConcertSpeakerDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/speaker_concert.png");
	}
}
