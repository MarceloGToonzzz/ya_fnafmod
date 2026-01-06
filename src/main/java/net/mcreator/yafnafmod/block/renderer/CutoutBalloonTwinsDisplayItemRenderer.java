package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBalloonTwinsDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutBalloonTwinsDisplayItem;

public class CutoutBalloonTwinsDisplayItemRenderer extends GeoItemRenderer<CutoutBalloonTwinsDisplayItem> {
	public CutoutBalloonTwinsDisplayItemRenderer() {
		super(new CutoutBalloonTwinsDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutBalloonTwinsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
