package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ChicaStandTileEntity;

public class ChicaStandBlockModel extends GeoModel<ChicaStandTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaStandTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/chica_stand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaStandTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/chica_stand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaStandTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stand_chica.png");
	}
}
