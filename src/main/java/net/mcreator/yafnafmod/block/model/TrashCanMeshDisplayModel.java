package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.TrashCanMeshDisplayItem;

public class TrashCanMeshDisplayModel extends GeoModel<TrashCanMeshDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanMeshDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcan_mesh.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanMeshDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcan_mesh.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanMeshDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcan_mesh.png");
	}
}
