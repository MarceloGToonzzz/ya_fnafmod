package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FredbearBloodyWrapBlockDisplayItem;

public class FredbearBloodyWrapBlockDisplayModel extends GeoModel<FredbearBloodyWrapBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearBloodyWrapBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_bloody.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearBloodyWrapBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_bloody.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearBloodyWrapBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fredbear_bloodywrap.png");
	}
}
