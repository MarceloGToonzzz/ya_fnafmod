package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DeactivatedBalloraTileEntity;

public class DeactivatedBalloraBlockModel extends GeoModel<DeactivatedBalloraTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeactivatedBalloraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/deactivated_ballora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeactivatedBalloraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/deactivated_ballora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeactivatedBalloraTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ballora_eyeclose.png");
	}
}
