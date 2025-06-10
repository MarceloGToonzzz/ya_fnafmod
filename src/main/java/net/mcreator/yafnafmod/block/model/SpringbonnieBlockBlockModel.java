package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SpringbonnieBlockTileEntity;

public class SpringbonnieBlockBlockModel extends GeoModel<SpringbonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springbonnie.png");
	}
}
