package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonJukeboxDisplayItem;

public class NeonJukeboxDisplayModel extends GeoModel<NeonJukeboxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonJukeboxDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/jukebox_neon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonJukeboxDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/jukebox_neon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonJukeboxDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/jukebox_neon.png");
	}
}
