package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.OldManConsequencesBlockDisplayItem;

public class OldManConsequencesBlockDisplayModel extends GeoModel<OldManConsequencesBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OldManConsequencesBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/omc.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldManConsequencesBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/omc.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldManConsequencesBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/omc.png");
	}
}
