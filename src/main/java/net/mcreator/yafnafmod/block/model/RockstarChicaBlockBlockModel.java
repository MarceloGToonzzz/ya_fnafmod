package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RockstarChicaBlockTileEntity;

public class RockstarChicaBlockBlockModel extends GeoModel<RockstarChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_chica.png");
	}
}
