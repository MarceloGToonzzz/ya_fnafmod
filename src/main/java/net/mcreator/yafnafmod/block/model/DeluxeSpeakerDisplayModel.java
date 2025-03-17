package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DeluxeSpeakerDisplayItem;

public class DeluxeSpeakerDisplayModel extends GeoModel<DeluxeSpeakerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeSpeakerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/speaker_deluxe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeSpeakerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/speaker_deluxe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeSpeakerDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/speaker_deluxe.png");
	}
}
