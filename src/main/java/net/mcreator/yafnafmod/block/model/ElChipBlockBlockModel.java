package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ElChipBlockTileEntity;

public class ElChipBlockBlockModel extends GeoModel<ElChipBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ElChipBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/el_chip.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElChipBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/el_chip.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElChipBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_el_chip.png");
	}
}
