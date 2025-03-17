package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceRedGlassDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigEntranceRedGlassDoorDisplayItem;

public class BigEntranceRedGlassDoorDisplayItemRenderer extends GeoItemRenderer<BigEntranceRedGlassDoorDisplayItem> {
	public BigEntranceRedGlassDoorDisplayItemRenderer() {
		super(new BigEntranceRedGlassDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceRedGlassDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
