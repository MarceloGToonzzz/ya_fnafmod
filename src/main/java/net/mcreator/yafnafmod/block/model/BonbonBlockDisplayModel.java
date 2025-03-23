package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BonbonBlockDisplayItem;

public class BonbonBlockDisplayModel extends GeoModel<BonbonBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonbonBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonbonBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonbonBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonbon.png");
	}
}
