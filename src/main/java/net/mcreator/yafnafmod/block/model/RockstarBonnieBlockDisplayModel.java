package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RockstarBonnieBlockDisplayItem;

public class RockstarBonnieBlockDisplayModel extends GeoModel<RockstarBonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockstarBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarBonnieBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rockstar_bonnie.png");
	}
}
