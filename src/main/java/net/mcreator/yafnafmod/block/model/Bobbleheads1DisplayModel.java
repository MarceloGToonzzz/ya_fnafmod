package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Bobbleheads1DisplayItem;

public class Bobbleheads1DisplayModel extends GeoModel<Bobbleheads1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Bobbleheads1DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bobbleheads_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Bobbleheads1DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bobbleheads_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Bobbleheads1DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bobbleheads_fredbonchi.png");
	}
}
