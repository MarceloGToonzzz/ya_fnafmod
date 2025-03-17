package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClawMachinePizzaPartyBlockModel;
import net.mcreator.yafnafmod.block.entity.ClawMachinePizzaPartyTileEntity;

public class ClawMachinePizzaPartyTileRenderer extends GeoBlockRenderer<ClawMachinePizzaPartyTileEntity> {
	public ClawMachinePizzaPartyTileRenderer() {
		super(new ClawMachinePizzaPartyBlockModel());
	}

	@Override
	public RenderType getRenderType(ClawMachinePizzaPartyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
