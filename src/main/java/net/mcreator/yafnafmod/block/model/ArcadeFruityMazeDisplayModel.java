package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ArcadeFruityMazeDisplayItem;

public class ArcadeFruityMazeDisplayModel extends GeoModel<ArcadeFruityMazeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeFruityMazeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcademachine_cocktail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeFruityMazeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcademachine_cocktail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeFruityMazeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcademachinecocktail_fruitymaze.png");
	}
}
