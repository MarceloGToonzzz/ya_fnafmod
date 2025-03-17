package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigOfficeDoorWindowed2DisplayItem;

public class BigOfficeDoorWindowed2DisplayModel extends GeoModel<BigOfficeDoorWindowed2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigOfficeDoorWindowed2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigOfficeDoorWindowed2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigOfficeDoorWindowed2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_officedoor_window2.png");
	}
}
