package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DumpsterGreenTileEntity;

public class DumpsterGreenBlockModel extends GeoModel<DumpsterGreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DumpsterGreenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dumpster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DumpsterGreenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dumpster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DumpsterGreenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dumpster_green.png");
	}
}
