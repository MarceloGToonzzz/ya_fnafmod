package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceRedGlassDoorWideDisplayModel;
import net.mcreator.yafnafmod.block.display.BigEntranceRedGlassDoorWideDisplayItem;

public class BigEntranceRedGlassDoorWideDisplayItemRenderer extends GeoItemRenderer<BigEntranceRedGlassDoorWideDisplayItem> {
	public BigEntranceRedGlassDoorWideDisplayItemRenderer() {
		super(new BigEntranceRedGlassDoorWideDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceRedGlassDoorWideDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
