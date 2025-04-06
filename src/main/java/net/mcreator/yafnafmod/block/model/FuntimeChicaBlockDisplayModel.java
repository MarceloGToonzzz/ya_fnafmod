package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FuntimeChicaBlockDisplayItem;

public class FuntimeChicaBlockDisplayModel extends GeoModel<FuntimeChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeChicaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftchica.png");
	}
}
