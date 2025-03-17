package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BonnieStandDisplayItem;

public class BonnieStandDisplayModel extends GeoModel<BonnieStandDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieStandDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonnie_stand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieStandDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonnie_stand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieStandDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stand_bonnie.png");
	}
}
