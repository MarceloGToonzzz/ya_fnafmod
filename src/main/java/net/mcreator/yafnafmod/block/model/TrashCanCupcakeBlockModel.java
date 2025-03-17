package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashCanCupcakeTileEntity;

public class TrashCanCupcakeBlockModel extends GeoModel<TrashCanCupcakeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanCupcakeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanCupcakeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanCupcakeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_cupcake.png");
	}
}
