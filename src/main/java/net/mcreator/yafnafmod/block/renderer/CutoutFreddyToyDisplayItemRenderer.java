package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFreddyToyDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFreddyToyDisplayItem;

public class CutoutFreddyToyDisplayItemRenderer extends GeoItemRenderer<CutoutFreddyToyDisplayItem> {
	public CutoutFreddyToyDisplayItemRenderer() {
		super(new CutoutFreddyToyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFreddyToyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
