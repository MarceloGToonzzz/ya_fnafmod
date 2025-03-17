package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PuppetBlockDisplayItem;

public class PuppetBlockDisplayModel extends GeoModel<PuppetBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/puppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/puppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_puppet_day.png");
	}
}
