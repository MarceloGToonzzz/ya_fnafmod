package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MusicBoxRedDecorationDisplayItem;

public class MusicBoxRedDecorationDisplayModel extends GeoModel<MusicBoxRedDecorationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MusicBoxRedDecorationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/puppetbox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicBoxRedDecorationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/puppetbox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicBoxRedDecorationDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/musicbox_deco_redwhite.png");
	}
}
