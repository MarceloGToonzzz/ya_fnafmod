package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DeactivatedFuntimeFreddyDisplayItem;

public class DeactivatedFuntimeFreddyDisplayModel extends GeoModel<DeactivatedFuntimeFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeactivatedFuntimeFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/deactivated_ftfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeactivatedFuntimeFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/deactivated_ftfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeactivatedFuntimeFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ftfreddy.png");
	}
}
