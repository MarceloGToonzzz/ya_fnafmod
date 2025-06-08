package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Bobbleheads3DisplayItem;

public class Bobbleheads3DisplayModel extends GeoModel<Bobbleheads3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Bobbleheads3DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bobbleheads_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Bobbleheads3DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bobbleheads_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Bobbleheads3DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bobbleheads_fredbearspring.png");
	}
}
