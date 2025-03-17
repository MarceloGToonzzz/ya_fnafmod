package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashDisplayItem;

public class TrashDisplayModel extends GeoModel<TrashDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trash1.png");
	}
}
