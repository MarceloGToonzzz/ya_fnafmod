package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutTreePalmDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutTreePalmDisplayItem;

public class CutoutTreePalmDisplayItemRenderer extends GeoItemRenderer<CutoutTreePalmDisplayItem> {
	public CutoutTreePalmDisplayItemRenderer() {
		super(new CutoutTreePalmDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutTreePalmDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
