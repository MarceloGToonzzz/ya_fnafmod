package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeMidnightMotoristTileEntity;

public class ArcadeMidnightMotoristBlockModel extends GeoModel<ArcadeMidnightMotoristTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeMidnightMotoristTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcademachine_cocktail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeMidnightMotoristTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcademachine_cocktail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeMidnightMotoristTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcademachinecocktail_midnightmotorist.png");
	}
}
