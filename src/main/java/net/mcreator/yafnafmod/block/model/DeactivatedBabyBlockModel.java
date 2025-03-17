package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DeactivatedBabyTileEntity;

public class DeactivatedBabyBlockModel extends GeoModel<DeactivatedBabyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeactivatedBabyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/deactivated_baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeactivatedBabyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/deactivated_baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeactivatedBabyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/deactivated_baby.png");
	}
}
