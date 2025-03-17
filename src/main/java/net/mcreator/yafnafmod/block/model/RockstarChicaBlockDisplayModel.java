package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RockstarChicaBlockDisplayItem;

public class RockstarChicaBlockDisplayModel extends GeoModel<RockstarChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockstarChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarChicaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_chica.png");
	}
}
