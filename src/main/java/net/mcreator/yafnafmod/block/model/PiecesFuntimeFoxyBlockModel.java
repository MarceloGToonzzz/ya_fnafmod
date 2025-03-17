package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PiecesFuntimeFoxyTileEntity;

public class PiecesFuntimeFoxyBlockModel extends GeoModel<PiecesFuntimeFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PiecesFuntimeFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pieces_ftfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PiecesFuntimeFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pieces_ftfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PiecesFuntimeFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ftfoxy.png");
	}
}
