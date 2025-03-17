package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Bobbleheads1TileEntity;

public class Bobbleheads1BlockModel extends GeoModel<Bobbleheads1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Bobbleheads1TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bobbleheads_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Bobbleheads1TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bobbleheads_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Bobbleheads1TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bobbleheads_fredbonchi.png");
	}
}
