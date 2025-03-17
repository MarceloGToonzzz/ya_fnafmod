package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ArcadeMidnightMotoristDisplayItem;

public class ArcadeMidnightMotoristDisplayModel extends GeoModel<ArcadeMidnightMotoristDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeMidnightMotoristDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcademachine_cocktail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeMidnightMotoristDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcademachine_cocktail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeMidnightMotoristDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcademachinecocktail_midnightmotorist.png");
	}
}
