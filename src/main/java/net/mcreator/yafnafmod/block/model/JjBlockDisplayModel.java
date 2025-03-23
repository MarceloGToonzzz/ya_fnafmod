package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.JjBlockDisplayItem;

public class JjBlockDisplayModel extends GeoModel<JjBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JjBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JjBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JjBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_jj.png");
	}
}
