package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DittophobiaFreddyBlockTileEntity;

public class DittophobiaFreddyBlockBlockModel extends GeoModel<DittophobiaFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_freddy.png");
	}
}
