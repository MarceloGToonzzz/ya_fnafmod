package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashCanFreddyTileEntity;

public class TrashCanFreddyBlockModel extends GeoModel<TrashCanFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_freddy.png");
	}
}
