package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FoxyStandTileEntity;

public class FoxyStandBlockModel extends GeoModel<FoxyStandTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/foxy_stand.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/foxy_stand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/foxy_stand.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/foxy_stand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyStandTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/stand_foxy-skin.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/stand_foxy.png");
	}
}
