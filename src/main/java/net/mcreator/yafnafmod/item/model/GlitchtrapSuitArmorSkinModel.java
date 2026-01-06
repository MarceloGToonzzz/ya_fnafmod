package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.GlitchtrapSuitArmorSkinItem;

public class GlitchtrapSuitArmorSkinModel extends GeoModel<GlitchtrapSuitArmorSkinItem> {
	@Override
	public ResourceLocation getAnimationResource(GlitchtrapSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchtrapSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchtrapSuitArmorSkinItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/glitchtrap_suit-skin.png");
	}
}
