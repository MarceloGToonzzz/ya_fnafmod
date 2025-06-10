package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyChicaChickenBlockTileEntity;

public class ToyChicaChickenBlockBlockModel extends GeoModel<ToyChicaChickenBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaChickenBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_chicachicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaChickenBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_chicachicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaChickenBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tchica_day.png");
	}
}
