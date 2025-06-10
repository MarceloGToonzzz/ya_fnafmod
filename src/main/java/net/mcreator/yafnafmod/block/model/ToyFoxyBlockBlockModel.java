package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyFoxyBlockTileEntity;

public class ToyFoxyBlockBlockModel extends GeoModel<ToyFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toyfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toyfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tfoxy_day.png");
	}
}
