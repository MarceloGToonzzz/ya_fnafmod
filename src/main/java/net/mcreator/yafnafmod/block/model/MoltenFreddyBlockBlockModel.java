package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.MoltenFreddyBlockTileEntity;

public class MoltenFreddyBlockBlockModel extends GeoModel<MoltenFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoltenFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/molten_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/molten_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenFreddyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_molten_freddy.png");
	}
}
