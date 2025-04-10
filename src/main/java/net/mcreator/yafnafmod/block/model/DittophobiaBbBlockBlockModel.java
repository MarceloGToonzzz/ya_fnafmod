package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DittophobiaBbBlockTileEntity;

public class DittophobiaBbBlockBlockModel extends GeoModel<DittophobiaBbBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaBbBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaBbBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaBbBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_bb.png");
	}
}
