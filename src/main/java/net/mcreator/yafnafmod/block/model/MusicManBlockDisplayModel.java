package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MusicManBlockDisplayItem;

public class MusicManBlockDisplayModel extends GeoModel<MusicManBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MusicManBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/music_man.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicManBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/music_man.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicManBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_music_man.png");
	}
}
