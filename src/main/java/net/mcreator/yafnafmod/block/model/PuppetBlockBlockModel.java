package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PuppetBlockTileEntity;

public class PuppetBlockBlockModel extends GeoModel<PuppetBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/puppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/puppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_puppet_day.png");
	}
}
