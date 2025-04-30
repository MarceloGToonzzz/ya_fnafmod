package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BonnieHeadDisplayItem;

public class BonnieHeadDisplayModel extends GeoModel<BonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_bonnieclassic.png");
	}
}
