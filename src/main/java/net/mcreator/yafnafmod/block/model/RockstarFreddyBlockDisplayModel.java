package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RockstarFreddyBlockDisplayItem;

public class RockstarFreddyBlockDisplayModel extends GeoModel<RockstarFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockstarFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarFreddyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_freddy.png");
	}
}
