package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashCanCupcakeDisplayItem;

public class TrashCanCupcakeDisplayModel extends GeoModel<TrashCanCupcakeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanCupcakeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanCupcakeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanCupcakeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_cupcake.png");
	}
}
