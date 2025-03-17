package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SinkKitchenDisplayModel;
import net.mcreator.yafnafmod.block.display.SinkKitchenDisplayItem;

public class SinkKitchenDisplayItemRenderer extends GeoItemRenderer<SinkKitchenDisplayItem> {
	public SinkKitchenDisplayItemRenderer() {
		super(new SinkKitchenDisplayModel());
	}

	@Override
	public RenderType getRenderType(SinkKitchenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
