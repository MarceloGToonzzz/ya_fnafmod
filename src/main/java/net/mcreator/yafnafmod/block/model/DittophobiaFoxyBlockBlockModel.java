package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DittophobiaFoxyBlockTileEntity;

public class DittophobiaFoxyBlockBlockModel extends GeoModel<DittophobiaFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_foxy.png");
	}
}
