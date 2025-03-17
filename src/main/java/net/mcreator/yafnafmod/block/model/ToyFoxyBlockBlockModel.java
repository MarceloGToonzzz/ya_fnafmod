package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyFoxyBlockTileEntity;

public class ToyFoxyBlockBlockModel extends GeoModel<ToyFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/toyfoxy.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/toyfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/toyfoxy.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/toyfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tfoxy_day_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tfoxy_day.png");
	}
}
