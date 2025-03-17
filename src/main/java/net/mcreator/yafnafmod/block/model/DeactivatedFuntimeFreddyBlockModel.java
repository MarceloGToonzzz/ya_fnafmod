package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DeactivatedFuntimeFreddyTileEntity;

public class DeactivatedFuntimeFreddyBlockModel extends GeoModel<DeactivatedFuntimeFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeactivatedFuntimeFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/deactivated_ftfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeactivatedFuntimeFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/deactivated_ftfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeactivatedFuntimeFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ftfreddy.png");
	}
}
