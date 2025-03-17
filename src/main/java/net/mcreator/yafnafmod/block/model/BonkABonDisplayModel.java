package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BonkABonDisplayItem;

public class BonkABonDisplayModel extends GeoModel<BonkABonDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonkABonDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonkabon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonkABonDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonkabon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonkABonDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bonkabon.png");
	}
}
