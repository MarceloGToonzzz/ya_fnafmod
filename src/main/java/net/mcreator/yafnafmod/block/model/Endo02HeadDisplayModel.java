package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Endo02HeadDisplayItem;

public class Endo02HeadDisplayModel extends GeoModel<Endo02HeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_endo02.png");
	}
}
