package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFoxyFuntimeDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFoxyFuntimeDisplayItem;

public class CutoutFoxyFuntimeDisplayItemRenderer extends GeoItemRenderer<CutoutFoxyFuntimeDisplayItem> {
	public CutoutFoxyFuntimeDisplayItemRenderer() {
		super(new CutoutFoxyFuntimeDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFoxyFuntimeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
