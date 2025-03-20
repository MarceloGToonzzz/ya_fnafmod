package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CircusBabyBlockDisplayItem;

public class CircusBabyBlockDisplayModel extends GeoModel<CircusBabyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CircusBabyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CircusBabyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CircusBabyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_baby.png");
	}
}
