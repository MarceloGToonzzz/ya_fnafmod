package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonnetBlockTileEntity;

public class BonnetBlockBlockModel extends GeoModel<BonnetBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnetBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnetBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnetBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonnet.png");
	}
}
