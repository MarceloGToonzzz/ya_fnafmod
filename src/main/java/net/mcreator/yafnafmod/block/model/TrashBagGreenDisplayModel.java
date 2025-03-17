package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashBagGreenDisplayItem;

public class TrashBagGreenDisplayModel extends GeoModel<TrashBagGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBagGreenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashbag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBagGreenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashbag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBagGreenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashbag_green.png");
	}
}
