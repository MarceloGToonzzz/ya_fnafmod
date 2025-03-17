package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigBackstageRedDoorWideDisplayItem;

public class BigBackstageRedDoorWideDisplayModel extends GeoModel<BigBackstageRedDoorWideDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageRedDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigwidedoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageRedDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigwidedoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageRedDoorWideDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redbackstage_wide.png");
	}
}
