package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FredbearBlockDisplayItem;

public class FredbearBlockDisplayModel extends GeoModel<FredbearBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_fredbear.png");
	}
}
