package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RockstarFoxyBlockDisplayItem;

public class RockstarFoxyBlockDisplayModel extends GeoModel<RockstarFoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockstarFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarFoxyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_foxy.png");
	}
}
