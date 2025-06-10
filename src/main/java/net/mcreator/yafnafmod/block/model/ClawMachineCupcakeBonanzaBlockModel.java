package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClawMachineCupcakeBonanzaTileEntity;

public class ClawMachineCupcakeBonanzaBlockModel extends GeoModel<ClawMachineCupcakeBonanzaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachineCupcakeBonanzaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clawmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachineCupcakeBonanzaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clawmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachineCupcakeBonanzaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clawmachine_cupcakebonanza.png");
	}
}
