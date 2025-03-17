package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigFanDisplayModel;
import net.mcreator.yafnafmod.block.display.BigFanDisplayItem;

public class BigFanDisplayItemRenderer extends GeoItemRenderer<BigFanDisplayItem> {
	public BigFanDisplayItemRenderer() {
		super(new BigFanDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigFanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
