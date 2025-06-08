package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Bobbleheads3TileEntity;

public class Bobbleheads3BlockModel extends GeoModel<Bobbleheads3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Bobbleheads3TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bobbleheads_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Bobbleheads3TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bobbleheads_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Bobbleheads3TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bobbleheads_fredbearspring.png");
	}
}
