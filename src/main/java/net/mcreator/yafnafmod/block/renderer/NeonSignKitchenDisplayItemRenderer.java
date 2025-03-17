package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonSignKitchenDisplayModel;
import net.mcreator.yafnafmod.block.display.NeonSignKitchenDisplayItem;

public class NeonSignKitchenDisplayItemRenderer extends GeoItemRenderer<NeonSignKitchenDisplayItem> {
	public NeonSignKitchenDisplayItemRenderer() {
		super(new NeonSignKitchenDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonSignKitchenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
