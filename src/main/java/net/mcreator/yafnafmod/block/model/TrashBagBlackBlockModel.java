package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashBagBlackTileEntity;

public class TrashBagBlackBlockModel extends GeoModel<TrashBagBlackTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBagBlackTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashbag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBagBlackTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashbag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBagBlackTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashbag_black.png");
	}
}
