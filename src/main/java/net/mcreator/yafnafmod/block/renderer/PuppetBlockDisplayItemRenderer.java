package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PuppetBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.PuppetBlockDisplayItem;

public class PuppetBlockDisplayItemRenderer extends GeoItemRenderer<PuppetBlockDisplayItem> {
	public PuppetBlockDisplayItemRenderer() {
		super(new PuppetBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(PuppetBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
