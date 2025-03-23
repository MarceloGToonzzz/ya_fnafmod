package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredJollyRatBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.WitheredJollyRatBlockDisplayItem;

public class WitheredJollyRatBlockDisplayItemRenderer extends GeoItemRenderer<WitheredJollyRatBlockDisplayItem> {
	public WitheredJollyRatBlockDisplayItemRenderer() {
		super(new WitheredJollyRatBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredJollyRatBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
