package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Endo01PileDisplayItem;

public class Endo01PileDisplayModel extends GeoModel<Endo01PileDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01PileDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endopile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01PileDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endopile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01PileDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo1.png");
	}
}
