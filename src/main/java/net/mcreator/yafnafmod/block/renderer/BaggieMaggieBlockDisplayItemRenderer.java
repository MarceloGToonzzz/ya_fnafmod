package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BaggieMaggieBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.BaggieMaggieBlockDisplayItem;

public class BaggieMaggieBlockDisplayItemRenderer extends GeoItemRenderer<BaggieMaggieBlockDisplayItem> {
	public BaggieMaggieBlockDisplayItemRenderer() {
		super(new BaggieMaggieBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BaggieMaggieBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
