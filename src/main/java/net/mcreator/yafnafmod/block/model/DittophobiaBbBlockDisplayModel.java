package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DittophobiaBbBlockDisplayItem;

public class DittophobiaBbBlockDisplayModel extends GeoModel<DittophobiaBbBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaBbBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaBbBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaBbBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_bb.png");
	}
}
