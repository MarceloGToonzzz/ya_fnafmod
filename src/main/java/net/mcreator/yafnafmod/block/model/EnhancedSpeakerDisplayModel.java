package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.EnhancedSpeakerDisplayItem;

public class EnhancedSpeakerDisplayModel extends GeoModel<EnhancedSpeakerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EnhancedSpeakerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/speaker_enhanced.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnhancedSpeakerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/speaker_enhanced.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnhancedSpeakerDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/speaker_enhanced.png");
	}
}
