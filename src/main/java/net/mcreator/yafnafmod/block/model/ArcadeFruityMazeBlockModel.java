package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeFruityMazeTileEntity;

public class ArcadeFruityMazeBlockModel extends GeoModel<ArcadeFruityMazeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeFruityMazeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcademachine_cocktail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeFruityMazeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcademachine_cocktail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeFruityMazeTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcademachinecocktail_fruitymaze.png");
	}
}
