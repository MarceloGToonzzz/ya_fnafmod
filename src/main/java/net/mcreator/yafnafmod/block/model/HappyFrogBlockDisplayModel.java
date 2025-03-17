package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.HappyFrogBlockDisplayItem;

public class HappyFrogBlockDisplayModel extends GeoModel<HappyFrogBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HappyFrogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/happy_frog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HappyFrogBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/happy_frog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HappyFrogBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_happy_frog.png");
	}
}
