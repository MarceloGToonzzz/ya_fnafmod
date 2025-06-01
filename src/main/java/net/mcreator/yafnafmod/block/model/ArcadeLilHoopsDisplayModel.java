package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ArcadeLilHoopsDisplayItem;

public class ArcadeLilHoopsDisplayModel extends GeoModel<ArcadeLilHoopsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeLilHoopsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_lilhoops.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeLilHoopsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_lilhoops.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeLilHoopsDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcade_lilhoops.png");
	}
}
