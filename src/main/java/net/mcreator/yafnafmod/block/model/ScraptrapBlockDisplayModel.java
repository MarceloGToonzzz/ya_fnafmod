package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ScraptrapBlockDisplayItem;

public class ScraptrapBlockDisplayModel extends GeoModel<ScraptrapBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ScraptrapBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/scraptrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScraptrapBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/scraptrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScraptrapBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_scraptrap.png");
	}
}
