package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashCanChicaTileEntity;

public class TrashCanChicaBlockModel extends GeoModel<TrashCanChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_chica.png");
	}
}
