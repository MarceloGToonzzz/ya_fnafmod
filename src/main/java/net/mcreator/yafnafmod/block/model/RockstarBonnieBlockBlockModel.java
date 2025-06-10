package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RockstarBonnieBlockTileEntity;

public class RockstarBonnieBlockBlockModel extends GeoModel<RockstarBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_bonnie.png");
	}
}
