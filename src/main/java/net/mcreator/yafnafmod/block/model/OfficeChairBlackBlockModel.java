package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.OfficeChairBlackTileEntity;

public class OfficeChairBlackBlockModel extends GeoModel<OfficeChairBlackTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OfficeChairBlackTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/officechair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OfficeChairBlackTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/officechair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OfficeChairBlackTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/officechair_black.png");
	}
}
