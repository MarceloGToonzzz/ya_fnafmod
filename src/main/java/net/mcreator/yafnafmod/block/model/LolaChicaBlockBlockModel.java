package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.LolaChicaBlockTileEntity;

public class LolaChicaBlockBlockModel extends GeoModel<LolaChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LolaChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/lola_chica.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/lola_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolaChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/lola_chica.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/lola_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolaChicaBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolachica_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lolachica.png");
	}
}
