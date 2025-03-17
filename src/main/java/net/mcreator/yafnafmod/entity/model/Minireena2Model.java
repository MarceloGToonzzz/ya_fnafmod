package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.Minireena2Entity;

public class Minireena2Model extends GeoModel<Minireena2Entity> {
	@Override
	public ResourceLocation getAnimationResource(Minireena2Entity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/minireena.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Minireena2Entity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/minireena.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Minireena2Entity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
