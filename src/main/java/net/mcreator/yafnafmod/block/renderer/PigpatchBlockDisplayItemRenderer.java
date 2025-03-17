package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PigpatchBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.PigpatchBlockDisplayItem;

public class PigpatchBlockDisplayItemRenderer extends GeoItemRenderer<PigpatchBlockDisplayItem> {
	public PigpatchBlockDisplayItemRenderer() {
		super(new PigpatchBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(PigpatchBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
