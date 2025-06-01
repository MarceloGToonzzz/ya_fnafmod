package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ArcadeBigTreatPounderDisplayItem;

public class ArcadeBigTreatPounderDisplayModel extends GeoModel<ArcadeBigTreatPounderDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeBigTreatPounderDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_bigtreatpounder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeBigTreatPounderDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_bigtreatpounder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeBigTreatPounderDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcademovie_bigtreatpounder.png");
	}
}
