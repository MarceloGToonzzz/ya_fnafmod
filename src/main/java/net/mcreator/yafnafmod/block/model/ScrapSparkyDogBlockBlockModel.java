package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ScrapSparkyDogBlockTileEntity;

public class ScrapSparkyDogBlockBlockModel extends GeoModel<ScrapSparkyDogBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScrapSparkyDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/sparky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapSparkyDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/sparky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapSparkyDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_sparky_scrap.png");
	}
}
