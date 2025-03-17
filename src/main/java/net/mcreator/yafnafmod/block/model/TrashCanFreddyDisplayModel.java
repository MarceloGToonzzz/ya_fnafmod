package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashCanFreddyDisplayItem;

public class TrashCanFreddyDisplayModel extends GeoModel<TrashCanFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_freddy.png");
	}
}
