package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SpringbonnieBlock01TileEntity;

public class SpringbonnieBlock01BlockModel extends GeoModel<SpringbonnieBlock01TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieBlock01TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieBlock01TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieBlock01TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_springbonnie_stage01.png");
	}
}
