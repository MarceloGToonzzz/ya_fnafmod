package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.HappyFrogBlockTileEntity;

public class HappyFrogBlockBlockModel extends GeoModel<HappyFrogBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HappyFrogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/happy_frog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HappyFrogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/happy_frog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HappyFrogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_happy_frog.png");
	}
}
