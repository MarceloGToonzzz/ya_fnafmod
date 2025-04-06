package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CandyCatBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CandyCatBlockDisplayItem;

public class CandyCatBlockDisplayItemRenderer extends GeoItemRenderer<CandyCatBlockDisplayItem> {
	public CandyCatBlockDisplayItemRenderer() {
		super(new CandyCatBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CandyCatBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
