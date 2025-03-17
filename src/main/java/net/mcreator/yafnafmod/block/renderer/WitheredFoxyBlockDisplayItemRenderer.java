package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredFoxyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.WitheredFoxyBlockDisplayItem;

public class WitheredFoxyBlockDisplayItemRenderer extends GeoItemRenderer<WitheredFoxyBlockDisplayItem> {
	public WitheredFoxyBlockDisplayItemRenderer() {
		super(new WitheredFoxyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredFoxyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
