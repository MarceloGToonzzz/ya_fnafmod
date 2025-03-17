package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeddbearBlockDisplayItem;

public class NeddbearBlockDisplayModel extends GeoModel<NeddbearBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeddbearBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/neddbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddbearBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/neddbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddbearBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_neddbear.png");
	}
}
