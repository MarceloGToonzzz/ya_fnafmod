package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.WitheredChicaBlockDisplayItem;

public class WitheredChicaBlockDisplayModel extends GeoModel<WitheredChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_chica.png");
	}
}
