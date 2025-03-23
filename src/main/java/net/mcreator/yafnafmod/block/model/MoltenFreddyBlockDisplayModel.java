package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MoltenFreddyBlockDisplayItem;

public class MoltenFreddyBlockDisplayModel extends GeoModel<MoltenFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MoltenFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/molten_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/molten_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenFreddyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_molten_freddy.png");
	}
}
