package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ArcadeFoosballDisplayItem;

public class ArcadeFoosballDisplayModel extends GeoModel<ArcadeFoosballDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeFoosballDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_foosball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeFoosballDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_foosball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeFoosballDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcade_foosball.png");
	}
}
