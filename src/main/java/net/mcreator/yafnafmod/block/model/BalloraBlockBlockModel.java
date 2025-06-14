package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BalloraBlockTileEntity;

public class BalloraBlockBlockModel extends GeoModel<BalloraBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloraBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/ballora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloraBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/ballora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloraBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ballora.png");
	}
}
