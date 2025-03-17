package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashCanFoxyTileEntity;

public class TrashCanFoxyBlockModel extends GeoModel<TrashCanFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_foxy.png");
	}
}
