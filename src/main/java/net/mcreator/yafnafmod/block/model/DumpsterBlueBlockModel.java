package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DumpsterBlueTileEntity;

public class DumpsterBlueBlockModel extends GeoModel<DumpsterBlueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DumpsterBlueTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dumpster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DumpsterBlueTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dumpster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DumpsterBlueTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dumpster_blue.png");
	}
}
