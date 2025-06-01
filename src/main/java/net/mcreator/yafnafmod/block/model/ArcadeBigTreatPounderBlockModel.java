package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeBigTreatPounderTileEntity;

public class ArcadeBigTreatPounderBlockModel extends GeoModel<ArcadeBigTreatPounderTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeBigTreatPounderTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_bigtreatpounder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeBigTreatPounderTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_bigtreatpounder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeBigTreatPounderTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcademovie_bigtreatpounder.png");
	}
}
