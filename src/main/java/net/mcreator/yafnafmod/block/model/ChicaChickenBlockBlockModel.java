package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ChicaChickenBlockTileEntity;

public class ChicaChickenBlockBlockModel extends GeoModel<ChicaChickenBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/chicachicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/chicachicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_chicachicken.png");
	}
}
