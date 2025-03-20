package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BalloraBlockDisplayItem;

public class BalloraBlockDisplayModel extends GeoModel<BalloraBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BalloraBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/ballora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloraBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/ballora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloraBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ballora.png");
	}
}
