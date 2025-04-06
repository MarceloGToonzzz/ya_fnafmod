package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CindyCatBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CindyCatBlockDisplayItem;

public class CindyCatBlockDisplayItemRenderer extends GeoItemRenderer<CindyCatBlockDisplayItem> {
	public CindyCatBlockDisplayItemRenderer() {
		super(new CindyCatBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CindyCatBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
