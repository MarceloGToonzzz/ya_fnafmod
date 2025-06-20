package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DougDogBlockTileEntity;

public class DougDogBlockBlockModel extends GeoModel<DougDogBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DougDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dougthedog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DougDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dougthedog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DougDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_doug.png");
	}
}
