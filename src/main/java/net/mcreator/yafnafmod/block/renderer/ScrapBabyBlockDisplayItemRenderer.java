package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScrapBabyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ScrapBabyBlockDisplayItem;

public class ScrapBabyBlockDisplayItemRenderer extends GeoItemRenderer<ScrapBabyBlockDisplayItem> {
	public ScrapBabyBlockDisplayItemRenderer() {
		super(new ScrapBabyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ScrapBabyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
