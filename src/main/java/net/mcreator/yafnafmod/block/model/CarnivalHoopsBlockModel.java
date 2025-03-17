package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarnivalHoopsTileEntity;

public class CarnivalHoopsBlockModel extends GeoModel<CarnivalHoopsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarnivalHoopsTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carnival_hoops.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarnivalHoopsTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carnival_hoops.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarnivalHoopsTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carnival_hoops.png");
	}
}
