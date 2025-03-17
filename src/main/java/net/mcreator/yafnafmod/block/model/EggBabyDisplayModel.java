package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.EggBabyDisplayItem;

public class EggBabyDisplayModel extends GeoModel<EggBabyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EggBabyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/egg_baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EggBabyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/egg_baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EggBabyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/egg_baby.png");
	}
}
