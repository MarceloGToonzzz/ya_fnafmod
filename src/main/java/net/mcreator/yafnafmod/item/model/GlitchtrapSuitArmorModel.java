package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.GlitchtrapSuitArmorItem;

public class GlitchtrapSuitArmorModel extends GeoModel<GlitchtrapSuitArmorItem> {
	@Override
	public ResourceLocation getAnimationResource(GlitchtrapSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchtrapSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchtrapSuitArmorItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/glitchtrap_suit.png");
	}
}
