package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DeactivatedBabyDisplayItem;

public class DeactivatedBabyDisplayModel extends GeoModel<DeactivatedBabyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeactivatedBabyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/deactivated_baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeactivatedBabyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/deactivated_baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeactivatedBabyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/deactivated_baby.png");
	}
}
