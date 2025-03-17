package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MrHippoBlockDisplayItem;

public class MrHippoBlockDisplayModel extends GeoModel<MrHippoBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MrHippoBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/mr_hippo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHippoBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/mr_hippo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHippoBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mr_hippo.png");
	}
}
