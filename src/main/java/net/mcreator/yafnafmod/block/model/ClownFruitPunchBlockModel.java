package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClownFruitPunchTileEntity;

public class ClownFruitPunchBlockModel extends GeoModel<ClownFruitPunchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClownFruitPunchTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clown_fruitpunch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClownFruitPunchTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clown_fruitpunch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClownFruitPunchTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clown_fruitpunch.png");
	}
}
