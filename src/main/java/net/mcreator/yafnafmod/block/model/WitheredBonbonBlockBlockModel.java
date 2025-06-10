package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.WitheredBonbonBlockTileEntity;

public class WitheredBonbonBlockBlockModel extends GeoModel<WitheredBonbonBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonbonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonbonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonbonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonbonwithered.png");
	}
}
