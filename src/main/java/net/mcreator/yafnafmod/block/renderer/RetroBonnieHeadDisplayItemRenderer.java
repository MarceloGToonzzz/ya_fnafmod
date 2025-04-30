package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroBonnieHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.RetroBonnieHeadDisplayItem;

public class RetroBonnieHeadDisplayItemRenderer extends GeoItemRenderer<RetroBonnieHeadDisplayItem> {
	public RetroBonnieHeadDisplayItemRenderer() {
		super(new RetroBonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroBonnieHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
