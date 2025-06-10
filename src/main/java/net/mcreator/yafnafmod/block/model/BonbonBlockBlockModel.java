package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonbonBlockTileEntity;

public class BonbonBlockBlockModel extends GeoModel<BonbonBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonbonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonbonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonbonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonbon.png");
	}
}
