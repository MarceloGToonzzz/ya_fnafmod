package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FreddyFazbearBlockTileEntity;

public class FreddyFazbearBlockBlockModel extends GeoModel<FreddyFazbearBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_freddyfazbear.png");
	}
}
