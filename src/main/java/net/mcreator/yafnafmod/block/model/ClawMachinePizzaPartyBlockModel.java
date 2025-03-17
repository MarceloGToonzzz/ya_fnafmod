package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClawMachinePizzaPartyTileEntity;

public class ClawMachinePizzaPartyBlockModel extends GeoModel<ClawMachinePizzaPartyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClawMachinePizzaPartyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/clawmachine.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/clawmachine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClawMachinePizzaPartyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/clawmachine.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/clawmachine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClawMachinePizzaPartyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/clawmachine_pizzaparty_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/clawmachine_pizzaparty.png");
	}
}
