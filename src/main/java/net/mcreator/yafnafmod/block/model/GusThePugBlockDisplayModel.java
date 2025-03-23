package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.GusThePugBlockDisplayItem;

public class GusThePugBlockDisplayModel extends GeoModel<GusThePugBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GusThePugBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/gus_the_pug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GusThePugBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/gus_the_pug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GusThePugBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_gus_the_pug.png");
	}
}
