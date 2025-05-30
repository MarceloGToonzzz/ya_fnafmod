package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.TrashBagGreenTileEntity;

public class TrashBagGreenBlockModel extends GeoModel<TrashBagGreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBagGreenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/trashbag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBagGreenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/trashbag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBagGreenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/trashbag_green.png");
	}
}
