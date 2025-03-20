package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RustyBlockDisplayItem;

public class RustyBlockDisplayModel extends GeoModel<RustyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RustyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RustyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RustyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo1_rusty.png");
	}
}
