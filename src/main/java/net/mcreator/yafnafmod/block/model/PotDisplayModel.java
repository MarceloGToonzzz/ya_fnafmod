package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PotDisplayItem;

public class PotDisplayModel extends GeoModel<PotDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PotDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PotDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PotDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pot.png");
	}
}
