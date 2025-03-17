package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutChicaRetroDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutChicaRetroDisplayItem;

public class CutoutChicaRetroDisplayItemRenderer extends GeoItemRenderer<CutoutChicaRetroDisplayItem> {
	public CutoutChicaRetroDisplayItemRenderer() {
		super(new CutoutChicaRetroDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutChicaRetroDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
