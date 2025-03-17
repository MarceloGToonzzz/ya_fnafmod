package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ChicaChickenBlockDisplayItem;

public class ChicaChickenBlockDisplayModel extends GeoModel<ChicaChickenBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/chicachicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/chicachicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_chicachicken.png");
	}
}
