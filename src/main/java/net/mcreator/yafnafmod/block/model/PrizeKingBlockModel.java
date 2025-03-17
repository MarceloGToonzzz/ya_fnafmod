package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PrizeKingTileEntity;

public class PrizeKingBlockModel extends GeoModel<PrizeKingTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PrizeKingTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/prize_king.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrizeKingTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/prize_king.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrizeKingTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/prize_king.png");
	}
}
