package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.OfficeChairRedTileEntity;

public class OfficeChairRedBlockModel extends GeoModel<OfficeChairRedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OfficeChairRedTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/officechair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OfficeChairRedTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/officechair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OfficeChairRedTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/officechair_red.png");
	}
}
