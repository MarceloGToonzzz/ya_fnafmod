package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MusicBoxDecorationDisplayItem;

public class MusicBoxDecorationDisplayModel extends GeoModel<MusicBoxDecorationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MusicBoxDecorationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/puppetbox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicBoxDecorationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/puppetbox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicBoxDecorationDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/musicbox_deco.png");
	}
}
