package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBonnieToyDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutBonnieToyDisplayItem;

public class CutoutBonnieToyDisplayItemRenderer extends GeoItemRenderer<CutoutBonnieToyDisplayItem> {
	public CutoutBonnieToyDisplayItemRenderer() {
		super(new CutoutBonnieToyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutBonnieToyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
