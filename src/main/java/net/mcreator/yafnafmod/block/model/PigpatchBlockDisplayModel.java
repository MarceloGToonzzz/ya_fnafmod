package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PigpatchBlockDisplayItem;

public class PigpatchBlockDisplayModel extends GeoModel<PigpatchBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PigpatchBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pigpatch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PigpatchBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pigpatch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PigpatchBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_pigpatch.png");
	}
}
