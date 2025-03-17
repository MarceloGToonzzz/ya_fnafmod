package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NeonJukeboxTileEntity;

public class NeonJukeboxBlockModel extends GeoModel<NeonJukeboxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonJukeboxTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/jukebox_neon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonJukeboxTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/jukebox_neon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonJukeboxTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/jukebox_neon.png");
	}
}
