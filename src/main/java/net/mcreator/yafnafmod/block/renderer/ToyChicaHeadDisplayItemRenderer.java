package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyChicaHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.ToyChicaHeadDisplayItem;

public class ToyChicaHeadDisplayItemRenderer extends GeoItemRenderer<ToyChicaHeadDisplayItem> {
	public ToyChicaHeadDisplayItemRenderer() {
		super(new ToyChicaHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyChicaHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
