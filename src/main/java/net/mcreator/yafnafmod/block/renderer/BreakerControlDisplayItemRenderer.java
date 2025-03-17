package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BreakerControlDisplayModel;
import net.mcreator.yafnafmod.block.display.BreakerControlDisplayItem;

public class BreakerControlDisplayItemRenderer extends GeoItemRenderer<BreakerControlDisplayItem> {
	public BreakerControlDisplayItemRenderer() {
		super(new BreakerControlDisplayModel());
	}

	@Override
	public RenderType getRenderType(BreakerControlDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
