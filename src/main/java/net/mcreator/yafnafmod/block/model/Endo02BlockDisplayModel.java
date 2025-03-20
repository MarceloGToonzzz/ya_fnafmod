package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Endo02BlockDisplayItem;

public class Endo02BlockDisplayModel extends GeoModel<Endo02BlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endo02block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endo02block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02BlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo2.png");
	}
}
