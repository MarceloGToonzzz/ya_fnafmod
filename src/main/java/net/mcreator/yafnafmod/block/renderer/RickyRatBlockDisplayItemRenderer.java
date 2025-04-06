package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RickyRatBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RickyRatBlockDisplayItem;

public class RickyRatBlockDisplayItemRenderer extends GeoItemRenderer<RickyRatBlockDisplayItem> {
	public RickyRatBlockDisplayItemRenderer() {
		super(new RickyRatBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RickyRatBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
