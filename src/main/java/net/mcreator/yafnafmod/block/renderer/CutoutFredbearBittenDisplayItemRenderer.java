package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFredbearBittenDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFredbearBittenDisplayItem;

public class CutoutFredbearBittenDisplayItemRenderer extends GeoItemRenderer<CutoutFredbearBittenDisplayItem> {
	public CutoutFredbearBittenDisplayItemRenderer() {
		super(new CutoutFredbearBittenDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFredbearBittenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
