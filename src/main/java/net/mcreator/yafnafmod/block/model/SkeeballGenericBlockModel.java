package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SkeeballGenericTileEntity;

public class SkeeballGenericBlockModel extends GeoModel<SkeeballGenericTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkeeballGenericTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/skeeball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeballGenericTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/skeeball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeballGenericTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/skeeball_generic.png");
	}
}
