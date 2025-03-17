package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MangleBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.MangleBlockDisplayItem;

public class MangleBlockDisplayItemRenderer extends GeoItemRenderer<MangleBlockDisplayItem> {
	public MangleBlockDisplayItemRenderer() {
		super(new MangleBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(MangleBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
