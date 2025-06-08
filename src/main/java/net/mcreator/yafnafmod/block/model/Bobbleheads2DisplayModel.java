package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Bobbleheads2DisplayItem;

public class Bobbleheads2DisplayModel extends GeoModel<Bobbleheads2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Bobbleheads2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bobbleheads_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Bobbleheads2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bobbleheads_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Bobbleheads2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bobbleheads_toyfredbonchi.png");
	}
}
