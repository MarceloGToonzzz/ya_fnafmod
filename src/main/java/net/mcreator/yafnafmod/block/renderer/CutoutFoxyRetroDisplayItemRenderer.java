package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFoxyRetroDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFoxyRetroDisplayItem;

public class CutoutFoxyRetroDisplayItemRenderer extends GeoItemRenderer<CutoutFoxyRetroDisplayItem> {
	public CutoutFoxyRetroDisplayItemRenderer() {
		super(new CutoutFoxyRetroDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFoxyRetroDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
