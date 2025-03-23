package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Lolbit409BlockDisplayItem;

public class Lolbit409BlockDisplayModel extends GeoModel<Lolbit409BlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Lolbit409BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/lolbit_409.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Lolbit409BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/lolbit_409.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Lolbit409BlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolbit_409.png");
	}
}
