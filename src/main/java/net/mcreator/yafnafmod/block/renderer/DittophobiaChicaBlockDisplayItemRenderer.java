package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaChicaBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.DittophobiaChicaBlockDisplayItem;

public class DittophobiaChicaBlockDisplayItemRenderer extends GeoItemRenderer<DittophobiaChicaBlockDisplayItem> {
	public DittophobiaChicaBlockDisplayItemRenderer() {
		super(new DittophobiaChicaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaChicaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
