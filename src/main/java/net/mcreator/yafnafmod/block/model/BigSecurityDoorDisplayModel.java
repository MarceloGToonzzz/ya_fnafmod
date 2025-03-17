package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigSecurityDoorDisplayItem;

public class BigSecurityDoorDisplayModel extends GeoModel<BigSecurityDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigSecurityDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/big_securitydoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigSecurityDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/big_securitydoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigSecurityDoorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/big_securitydoor.png");
	}
}
