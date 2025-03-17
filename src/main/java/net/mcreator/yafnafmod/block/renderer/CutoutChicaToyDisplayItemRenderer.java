package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutChicaToyDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutChicaToyDisplayItem;

public class CutoutChicaToyDisplayItemRenderer extends GeoItemRenderer<CutoutChicaToyDisplayItem> {
	public CutoutChicaToyDisplayItemRenderer() {
		super(new CutoutChicaToyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutChicaToyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
