package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.GasMaskItem;

public class GasMaskModel extends GeoModel<GasMaskItem> {
	@Override
	public ResourceLocation getAnimationResource(GasMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "animations/gas_mask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GasMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "geo/gas_mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GasMaskItem object) {
		return new ResourceLocation("ya_fnafmod", "textures/item/gas_mask.png");
	}
}
