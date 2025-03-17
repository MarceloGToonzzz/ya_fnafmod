package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToyChicaChickenBlockDisplayItem;

public class ToyChicaChickenBlockDisplayModel extends GeoModel<ToyChicaChickenBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaChickenBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_chicachicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaChickenBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_chicachicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaChickenBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tchica_day.png");
	}
}
