package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeLilHoopsTileEntity;

public class ArcadeLilHoopsBlockModel extends GeoModel<ArcadeLilHoopsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeLilHoopsTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_lilhoops.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeLilHoopsTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_lilhoops.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeLilHoopsTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcade_lilhoops.png");
	}
}
