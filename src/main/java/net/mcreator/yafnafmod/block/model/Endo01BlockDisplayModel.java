package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Endo01BlockDisplayItem;

public class Endo01BlockDisplayModel extends GeoModel<Endo01BlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01BlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo1.png");
	}
}
