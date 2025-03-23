package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NumberOneCrateBlockTileEntity;

public class NumberOneCrateBlockBlockModel extends GeoModel<NumberOneCrateBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NumberOneCrateBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/numberone_crate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NumberOneCrateBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/numberone_crate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NumberOneCrateBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_no1_crate.png");
	}
}
