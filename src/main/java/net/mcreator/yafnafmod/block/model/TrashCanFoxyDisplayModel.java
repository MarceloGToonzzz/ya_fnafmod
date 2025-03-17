package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashCanFoxyDisplayItem;

public class TrashCanFoxyDisplayModel extends GeoModel<TrashCanFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanFoxyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_foxy.png");
	}
}
