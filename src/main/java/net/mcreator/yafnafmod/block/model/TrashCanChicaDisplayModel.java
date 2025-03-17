package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashCanChicaDisplayItem;

public class TrashCanChicaDisplayModel extends GeoModel<TrashCanChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanChicaDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_chica.png");
	}
}
