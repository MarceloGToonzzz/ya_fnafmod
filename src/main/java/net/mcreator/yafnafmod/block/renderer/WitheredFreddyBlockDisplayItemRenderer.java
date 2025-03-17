package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredFreddyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.WitheredFreddyBlockDisplayItem;

public class WitheredFreddyBlockDisplayItemRenderer extends GeoItemRenderer<WitheredFreddyBlockDisplayItem> {
	public WitheredFreddyBlockDisplayItemRenderer() {
		super(new WitheredFreddyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredFreddyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
