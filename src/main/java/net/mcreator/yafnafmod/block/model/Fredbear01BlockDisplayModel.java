package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Fredbear01BlockDisplayItem;

public class Fredbear01BlockDisplayModel extends GeoModel<Fredbear01BlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Fredbear01BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fredbear01BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fredbear01BlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_fredbear_stage01.png");
	}
}
