package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.GrandfatherClockTileEntity;

public class GrandfatherClockBlockModel extends GeoModel<GrandfatherClockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrandfatherClockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/grandfather_clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrandfatherClockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/grandfather_clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrandfatherClockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/grandfather_clock.png");
	}
}
