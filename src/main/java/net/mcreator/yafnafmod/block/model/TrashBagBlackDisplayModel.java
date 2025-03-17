package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashBagBlackDisplayItem;

public class TrashBagBlackDisplayModel extends GeoModel<TrashBagBlackDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBagBlackDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashbag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBagBlackDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashbag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBagBlackDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashbag_black.png");
	}
}
