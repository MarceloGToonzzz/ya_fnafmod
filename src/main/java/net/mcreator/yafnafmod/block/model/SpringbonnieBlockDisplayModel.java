package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SpringbonnieBlockDisplayItem;

public class SpringbonnieBlockDisplayModel extends GeoModel<SpringbonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springbonnie.png");
	}
}
