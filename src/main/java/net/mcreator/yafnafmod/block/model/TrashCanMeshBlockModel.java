package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashCanMeshTileEntity;

public class TrashCanMeshBlockModel extends GeoModel<TrashCanMeshTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanMeshTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashcan_mesh.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanMeshTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashcan_mesh.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanMeshTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashcan_mesh.png");
	}
}
