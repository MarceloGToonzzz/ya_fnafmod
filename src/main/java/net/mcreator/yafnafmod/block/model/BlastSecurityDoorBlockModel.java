package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BlastSecurityDoorTileEntity;

public class BlastSecurityDoorBlockModel extends GeoModel<BlastSecurityDoorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlastSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/blast_securitydoor_open.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/blast_securitydoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlastSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/blast_securitydoor_open.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/blast_securitydoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlastSecurityDoorTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/blast_securitydoor.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/blast_securitydoor.png");
	}
}
