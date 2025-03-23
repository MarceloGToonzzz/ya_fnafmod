package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.MrHugsBlockTileEntity;

public class MrHugsBlockBlockModel extends GeoModel<MrHugsBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHugsBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/mrhugs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHugsBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/mrhugs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHugsBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mrhugs.png");
	}
}
