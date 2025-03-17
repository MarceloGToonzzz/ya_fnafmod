package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DeactivatedBalloraDisplayItem;

public class DeactivatedBalloraDisplayModel extends GeoModel<DeactivatedBalloraDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeactivatedBalloraDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/deactivated_ballora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeactivatedBalloraDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/deactivated_ballora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeactivatedBalloraDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ballora_eyeclose.png");
	}
}
