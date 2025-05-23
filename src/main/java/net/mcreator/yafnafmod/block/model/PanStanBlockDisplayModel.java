package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PanStanBlockDisplayItem;

public class PanStanBlockDisplayModel extends GeoModel<PanStanBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PanStanBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pan_stan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PanStanBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pan_stan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PanStanBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_pan_stan.png");
	}
}
