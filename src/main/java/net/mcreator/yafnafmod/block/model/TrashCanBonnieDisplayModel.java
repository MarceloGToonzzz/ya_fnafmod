package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashCanBonnieDisplayItem;

public class TrashCanBonnieDisplayModel extends GeoModel<TrashCanBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanBonnieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_bonnie.png");
	}
}
