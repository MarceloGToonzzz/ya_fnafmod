package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroBonnieBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RetroBonnieBlockDisplayItem;

public class RetroBonnieBlockDisplayItemRenderer extends GeoItemRenderer<RetroBonnieBlockDisplayItem> {
	public RetroBonnieBlockDisplayItemRenderer() {
		super(new RetroBonnieBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroBonnieBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
