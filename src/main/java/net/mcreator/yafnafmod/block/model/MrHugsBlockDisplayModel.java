package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MrHugsBlockDisplayItem;

public class MrHugsBlockDisplayModel extends GeoModel<MrHugsBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MrHugsBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/mrhugs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHugsBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/mrhugs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHugsBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mrhugs.png");
	}
}
