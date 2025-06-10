package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FuntimeChicaBlockTileEntity;

public class FuntimeChicaBlockBlockModel extends GeoModel<FuntimeChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftchica.png");
	}
}
