package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SpringtrapBlockDisplayItem;

public class SpringtrapBlockDisplayModel extends GeoModel<SpringtrapBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/springtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/springtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springtrap.png");
	}
}
