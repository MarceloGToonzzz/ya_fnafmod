package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BlastSecurityDoorDisplayItem;

public class BlastSecurityDoorDisplayModel extends GeoModel<BlastSecurityDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlastSecurityDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/blast_securitydoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlastSecurityDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/blast_securitydoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlastSecurityDoorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/blast_securitydoor.png");
	}
}
