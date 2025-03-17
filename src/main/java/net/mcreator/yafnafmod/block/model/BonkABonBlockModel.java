package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonkABonTileEntity;

public class BonkABonBlockModel extends GeoModel<BonkABonTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonkABonTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonkabon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonkABonTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonkabon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonkABonTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bonkabon.png");
	}
}
