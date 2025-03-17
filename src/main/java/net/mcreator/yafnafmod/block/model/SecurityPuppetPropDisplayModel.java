package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SecurityPuppetPropDisplayItem;

public class SecurityPuppetPropDisplayModel extends GeoModel<SecurityPuppetPropDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SecurityPuppetPropDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/security_puppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecurityPuppetPropDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/security_puppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecurityPuppetPropDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/security_puppet.png");
	}
}
