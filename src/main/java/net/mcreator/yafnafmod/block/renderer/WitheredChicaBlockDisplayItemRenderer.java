package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredChicaBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.WitheredChicaBlockDisplayItem;

public class WitheredChicaBlockDisplayItemRenderer extends GeoItemRenderer<WitheredChicaBlockDisplayItem> {
	public WitheredChicaBlockDisplayItemRenderer() {
		super(new WitheredChicaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredChicaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
