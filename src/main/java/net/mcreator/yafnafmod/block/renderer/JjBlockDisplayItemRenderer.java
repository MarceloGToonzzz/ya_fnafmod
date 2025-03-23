package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.JjBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.JjBlockDisplayItem;

public class JjBlockDisplayItemRenderer extends GeoItemRenderer<JjBlockDisplayItem> {
	public JjBlockDisplayItemRenderer() {
		super(new JjBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(JjBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
