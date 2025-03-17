package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PiecesFuntimeFreddyTileEntity;

public class PiecesFuntimeFreddyBlockModel extends GeoModel<PiecesFuntimeFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PiecesFuntimeFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pieces_ftfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PiecesFuntimeFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pieces_ftfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PiecesFuntimeFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ftfreddy.png");
	}
}
