package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SkeeballGenericDisplayItem;

public class SkeeballGenericDisplayModel extends GeoModel<SkeeballGenericDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SkeeballGenericDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/skeeball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeeballGenericDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/skeeball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeeballGenericDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/skeeball_generic.png");
	}
}
