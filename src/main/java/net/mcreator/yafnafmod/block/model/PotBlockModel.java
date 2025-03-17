package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PotTileEntity;

public class PotBlockModel extends GeoModel<PotTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PotTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PotTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PotTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pot.png");
	}
}
