package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DrTeethBlockDisplayItem;

public class DrTeethBlockDisplayModel extends GeoModel<DrTeethBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrTeethBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bidybab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrTeethBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bidybab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrTeethBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_drteeth.png");
	}
}
