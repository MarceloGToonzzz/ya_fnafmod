package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScrapSparkyDogBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ScrapSparkyDogBlockDisplayItem;

public class ScrapSparkyDogBlockDisplayItemRenderer extends GeoItemRenderer<ScrapSparkyDogBlockDisplayItem> {
	public ScrapSparkyDogBlockDisplayItemRenderer() {
		super(new ScrapSparkyDogBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ScrapSparkyDogBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
