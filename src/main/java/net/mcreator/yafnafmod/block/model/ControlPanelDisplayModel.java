package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ControlPanelDisplayItem;

public class ControlPanelDisplayModel extends GeoModel<ControlPanelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ControlPanelDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/controlpanel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ControlPanelDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/controlpanel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ControlPanelDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/controlpanel.png");
	}
}
