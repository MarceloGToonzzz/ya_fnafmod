package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeCandyCraneMachineTileEntity;

public class ArcadeCandyCraneMachineBlockModel extends GeoModel<ArcadeCandyCraneMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeCandyCraneMachineTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_candycrane.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeCandyCraneMachineTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_candycrane.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeCandyCraneMachineTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcade_candycrane.png");
	}
}
