package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigDecoratedGlassEntranceDoorWideDisplayModel;
import net.mcreator.yafnafmod.block.display.BigDecoratedGlassEntranceDoorWideDisplayItem;

public class BigDecoratedGlassEntranceDoorWideDisplayItemRenderer extends GeoItemRenderer<BigDecoratedGlassEntranceDoorWideDisplayItem> {
	public BigDecoratedGlassEntranceDoorWideDisplayItemRenderer() {
		super(new BigDecoratedGlassEntranceDoorWideDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigDecoratedGlassEntranceDoorWideDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
