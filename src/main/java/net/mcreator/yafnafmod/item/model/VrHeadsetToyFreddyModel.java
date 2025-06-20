package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.VrHeadsetToyFreddyItem;

public class VrHeadsetToyFreddyModel extends GeoModel<VrHeadsetToyFreddyItem> {
	@Override
	public ResourceLocation getAnimationResource(VrHeadsetToyFreddyItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/vrheadset_toyfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VrHeadsetToyFreddyItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/vrheadset_toyfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VrHeadsetToyFreddyItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/vrheadset_toyfreddy.png");
	}
}
