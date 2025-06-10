package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.NeddbearBlockTileEntity;

public class NeddbearBlockBlockModel extends GeoModel<NeddbearBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeddbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neddbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neddbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddbearBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_neddbear.png");
	}
}
