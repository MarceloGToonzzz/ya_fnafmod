package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.EggBabyTileEntity;

public class EggBabyBlockModel extends GeoModel<EggBabyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EggBabyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/egg_baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EggBabyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/egg_baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EggBabyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/egg_baby.png");
	}
}
