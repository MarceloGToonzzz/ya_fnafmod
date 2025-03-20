package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DittophobiaBonnieBlockDisplayItem;

public class DittophobiaBonnieBlockDisplayModel extends GeoModel<DittophobiaBonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DittophobiaBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dittophobia_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DittophobiaBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dittophobia_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DittophobiaBonnieBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dittophobia_bonnie.png");
	}
}
