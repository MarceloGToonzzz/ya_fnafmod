package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SpringbonnieBlock01DisplayItem;

public class SpringbonnieBlock01DisplayModel extends GeoModel<SpringbonnieBlock01DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieBlock01DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieBlock01DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieBlock01DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springbonnie_stage01.png");
	}
}
