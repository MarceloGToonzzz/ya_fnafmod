package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.WitheredBonnieBlockDisplayItem;

public class WitheredBonnieBlockDisplayModel extends GeoModel<WitheredBonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_bonnie.png");
	}
}
