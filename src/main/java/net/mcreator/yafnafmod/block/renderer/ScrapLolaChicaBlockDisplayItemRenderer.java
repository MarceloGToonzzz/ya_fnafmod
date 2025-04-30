package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScrapLolaChicaBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ScrapLolaChicaBlockDisplayItem;

public class ScrapLolaChicaBlockDisplayItemRenderer extends GeoItemRenderer<ScrapLolaChicaBlockDisplayItem> {
	public ScrapLolaChicaBlockDisplayItemRenderer() {
		super(new ScrapLolaChicaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ScrapLolaChicaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
