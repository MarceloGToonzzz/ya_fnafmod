package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarnivalHoopsDisplayItem;

public class CarnivalHoopsDisplayModel extends GeoModel<CarnivalHoopsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarnivalHoopsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carnival_hoops.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarnivalHoopsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carnival_hoops.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarnivalHoopsDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carnival_hoops.png");
	}
}
