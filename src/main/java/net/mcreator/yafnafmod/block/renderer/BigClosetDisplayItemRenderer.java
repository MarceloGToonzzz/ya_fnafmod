package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigClosetDisplayModel;
import net.mcreator.yafnafmod.block.display.BigClosetDisplayItem;

public class BigClosetDisplayItemRenderer extends GeoItemRenderer<BigClosetDisplayItem> {
	public BigClosetDisplayItemRenderer() {
		super(new BigClosetDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigClosetDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
