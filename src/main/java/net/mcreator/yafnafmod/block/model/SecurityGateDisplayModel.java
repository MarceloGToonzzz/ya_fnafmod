package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SecurityGateDisplayItem;

public class SecurityGateDisplayModel extends GeoModel<SecurityGateDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SecurityGateDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/securitygate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecurityGateDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/securitygate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecurityGateDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/securitygate.png");
	}
}
