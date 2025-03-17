package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PlushFingertrapDisplayItem;

public class PlushFingertrapDisplayModel extends GeoModel<PlushFingertrapDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PlushFingertrapDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fingertrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlushFingertrapDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fingertrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlushFingertrapDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/plush_bonnie_fingertrap.png");
	}
}
