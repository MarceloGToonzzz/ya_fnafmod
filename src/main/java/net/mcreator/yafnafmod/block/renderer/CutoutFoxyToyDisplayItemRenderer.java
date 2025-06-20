package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFoxyToyDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFoxyToyDisplayItem;

public class CutoutFoxyToyDisplayItemRenderer extends GeoItemRenderer<CutoutFoxyToyDisplayItem> {
	public CutoutFoxyToyDisplayItemRenderer() {
		super(new CutoutFoxyToyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFoxyToyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
