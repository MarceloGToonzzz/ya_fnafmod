package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClownLemonadeTileEntity;

public class ClownLemonadeBlockModel extends GeoModel<ClownLemonadeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClownLemonadeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clown_lemonade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClownLemonadeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clown_lemonade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClownLemonadeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clown_lemonade.png");
	}
}
