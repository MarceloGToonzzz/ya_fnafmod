package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RetroBonnieBlockDisplayItem;

public class RetroBonnieBlockDisplayModel extends GeoModel<RetroBonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroBonnieBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_bonnie.png");
	}
}
