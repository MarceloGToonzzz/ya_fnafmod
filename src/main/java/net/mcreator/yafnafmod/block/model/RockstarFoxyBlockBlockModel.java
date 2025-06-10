package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RockstarFoxyBlockTileEntity;

public class RockstarFoxyBlockBlockModel extends GeoModel<RockstarFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_foxy.png");
	}
}
