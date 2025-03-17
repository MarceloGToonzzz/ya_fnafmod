package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashCanBonnieTileEntity;

public class TrashCanBonnieBlockModel extends GeoModel<TrashCanBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcharacter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcharacter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcharacter_bonnie.png");
	}
}
