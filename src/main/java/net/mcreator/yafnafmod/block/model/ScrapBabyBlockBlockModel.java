package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ScrapBabyBlockTileEntity;

public class ScrapBabyBlockBlockModel extends GeoModel<ScrapBabyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScrapBabyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/scrap_baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapBabyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/scrap_baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapBabyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_scrap_baby.png");
	}
}
