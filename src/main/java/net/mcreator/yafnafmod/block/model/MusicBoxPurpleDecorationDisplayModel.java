package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MusicBoxPurpleDecorationDisplayItem;

public class MusicBoxPurpleDecorationDisplayModel extends GeoModel<MusicBoxPurpleDecorationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MusicBoxPurpleDecorationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/puppetbox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicBoxPurpleDecorationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/puppetbox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicBoxPurpleDecorationDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/musicbox_deco_purplewhite.png");
	}
}
