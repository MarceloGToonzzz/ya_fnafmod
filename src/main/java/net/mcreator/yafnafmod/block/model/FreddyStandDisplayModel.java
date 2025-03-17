package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FreddyStandDisplayItem;

public class FreddyStandDisplayModel extends GeoModel<FreddyStandDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyStandDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/freddy_stand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyStandDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/freddy_stand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyStandDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stand_freddy.png");
	}
}
