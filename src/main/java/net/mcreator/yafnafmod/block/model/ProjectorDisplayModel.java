package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ProjectorDisplayItem;

public class ProjectorDisplayModel extends GeoModel<ProjectorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ProjectorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/projector_off.png");
	}
}
