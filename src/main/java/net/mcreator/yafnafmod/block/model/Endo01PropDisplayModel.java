package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Endo01PropDisplayItem;

public class Endo01PropDisplayModel extends GeoModel<Endo01PropDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01PropDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endo01_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01PropDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endo01_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01PropDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo1.png");
	}
}
