package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PinTheBowtieToyFreddyTileEntity;

public class PinTheBowtieToyFreddyBlockModel extends GeoModel<PinTheBowtieToyFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinTheBowtieToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinthebowtie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinTheBowtieToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinthebowtie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinTheBowtieToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinthebowtie_toy.png");
	}
}
