package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.EnhancedSpeakerTileEntity;

public class EnhancedSpeakerBlockModel extends GeoModel<EnhancedSpeakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnhancedSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/speaker_enhanced.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnhancedSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/speaker_enhanced.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnhancedSpeakerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/speaker_enhanced.png");
	}
}
