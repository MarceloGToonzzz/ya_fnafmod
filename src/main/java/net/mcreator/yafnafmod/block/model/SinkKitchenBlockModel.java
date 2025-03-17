package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SinkKitchenTileEntity;

public class SinkKitchenBlockModel extends GeoModel<SinkKitchenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SinkKitchenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/kitchen_sink.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SinkKitchenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/kitchen_sink.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SinkKitchenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/sinkkitchen.png");
	}
}
