package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFreddyFuntimeDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFreddyFuntimeDisplayItem;

public class CutoutFreddyFuntimeDisplayItemRenderer extends GeoItemRenderer<CutoutFreddyFuntimeDisplayItem> {
	public CutoutFreddyFuntimeDisplayItemRenderer() {
		super(new CutoutFreddyFuntimeDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFreddyFuntimeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
