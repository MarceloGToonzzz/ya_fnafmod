package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RustyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RustyBlockDisplayItem;

public class RustyBlockDisplayItemRenderer extends GeoItemRenderer<RustyBlockDisplayItem> {
	public RustyBlockDisplayItemRenderer() {
		super(new RustyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RustyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
