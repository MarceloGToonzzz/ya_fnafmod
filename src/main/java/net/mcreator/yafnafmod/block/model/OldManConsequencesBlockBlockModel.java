package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.OldManConsequencesBlockTileEntity;

public class OldManConsequencesBlockBlockModel extends GeoModel<OldManConsequencesBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OldManConsequencesBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/omc.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldManConsequencesBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/omc.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldManConsequencesBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/omc.png");
	}
}
