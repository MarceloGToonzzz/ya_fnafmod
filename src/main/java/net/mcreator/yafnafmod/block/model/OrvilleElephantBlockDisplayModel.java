package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.OrvilleElephantBlockDisplayItem;

public class OrvilleElephantBlockDisplayModel extends GeoModel<OrvilleElephantBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleElephantBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/orville_elephant.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleElephantBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/orville_elephant.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleElephantBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_orville_elephant.png");
	}
}
