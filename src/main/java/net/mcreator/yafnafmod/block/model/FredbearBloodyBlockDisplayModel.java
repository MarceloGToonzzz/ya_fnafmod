package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FredbearBloodyBlockDisplayItem;

public class FredbearBloodyBlockDisplayModel extends GeoModel<FredbearBloodyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearBloodyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_bloody.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearBloodyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_bloody.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearBloodyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fredbear_bloody.png");
	}
}
