package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PrizeKingDisplayModel;
import net.mcreator.yafnafmod.block.display.PrizeKingDisplayItem;

public class PrizeKingDisplayItemRenderer extends GeoItemRenderer<PrizeKingDisplayItem> {
	public PrizeKingDisplayItemRenderer() {
		super(new PrizeKingDisplayModel());
	}

	@Override
	public RenderType getRenderType(PrizeKingDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
