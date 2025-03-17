package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LeftyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.LeftyBlockDisplayItem;

public class LeftyBlockDisplayItemRenderer extends GeoItemRenderer<LeftyBlockDisplayItem> {
	public LeftyBlockDisplayItemRenderer() {
		super(new LeftyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeftyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
