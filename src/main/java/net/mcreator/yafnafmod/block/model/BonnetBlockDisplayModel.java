package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BonnetBlockDisplayItem;

public class BonnetBlockDisplayModel extends GeoModel<BonnetBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnetBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnetBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnetBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonnet.png");
	}
}
