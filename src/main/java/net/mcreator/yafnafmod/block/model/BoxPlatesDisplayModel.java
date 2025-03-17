package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BoxPlatesDisplayItem;

public class BoxPlatesDisplayModel extends GeoModel<BoxPlatesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoxPlatesDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/openbox_plates.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoxPlatesDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/openbox_plates.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoxPlatesDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/boxopen_plates.png");
	}
}
