package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SecurityPuppetPropTileEntity;

public class SecurityPuppetPropBlockModel extends GeoModel<SecurityPuppetPropTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SecurityPuppetPropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/security_puppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SecurityPuppetPropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/security_puppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SecurityPuppetPropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/security_puppet.png");
	}
}
