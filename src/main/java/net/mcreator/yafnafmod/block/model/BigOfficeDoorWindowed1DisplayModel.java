package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigOfficeDoorWindowed1DisplayItem;

public class BigOfficeDoorWindowed1DisplayModel extends GeoModel<BigOfficeDoorWindowed1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigOfficeDoorWindowed1DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigOfficeDoorWindowed1DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigOfficeDoorWindowed1DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_officedoor_window1.png");
	}
}
