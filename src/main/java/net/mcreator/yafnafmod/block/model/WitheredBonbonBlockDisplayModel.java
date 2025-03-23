package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.WitheredBonbonBlockDisplayItem;

public class WitheredBonbonBlockDisplayModel extends GeoModel<WitheredBonbonBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonbonBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonbonBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonbonBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonbonwithered.png");
	}
}
