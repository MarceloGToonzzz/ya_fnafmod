package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MrCanDoBlockDisplayItem;

public class MrCanDoBlockDisplayModel extends GeoModel<MrCanDoBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MrCanDoBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/mr_can_do.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrCanDoBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/mr_can_do.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrCanDoBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mr_can_do.png");
	}
}
