package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.LolbitBlockTileEntity;

public class LolbitBlockBlockModel extends GeoModel<LolbitBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LolbitBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolbitBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolbitBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolbit.png");
	}
}
