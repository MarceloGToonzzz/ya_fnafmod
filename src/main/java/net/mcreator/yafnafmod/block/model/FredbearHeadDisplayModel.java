package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FredbearHeadDisplayItem;

public class FredbearHeadDisplayModel extends GeoModel<FredbearHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_fredbear.png");
	}
}
