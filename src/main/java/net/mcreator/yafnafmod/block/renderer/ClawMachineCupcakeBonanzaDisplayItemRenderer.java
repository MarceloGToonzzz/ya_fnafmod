package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClawMachineCupcakeBonanzaDisplayModel;
import net.mcreator.yafnafmod.block.display.ClawMachineCupcakeBonanzaDisplayItem;

public class ClawMachineCupcakeBonanzaDisplayItemRenderer extends GeoItemRenderer<ClawMachineCupcakeBonanzaDisplayItem> {
	public ClawMachineCupcakeBonanzaDisplayItemRenderer() {
		super(new ClawMachineCupcakeBonanzaDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClawMachineCupcakeBonanzaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
