package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FreddyHeadDisplayItem;

public class FreddyHeadDisplayModel extends GeoModel<FreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_freddyclassic.png");
	}
}
