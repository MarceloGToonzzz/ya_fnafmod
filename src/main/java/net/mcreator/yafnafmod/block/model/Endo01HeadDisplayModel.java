package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Endo01HeadDisplayItem;

public class Endo01HeadDisplayModel extends GeoModel<Endo01HeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_endo01.png");
	}
}
