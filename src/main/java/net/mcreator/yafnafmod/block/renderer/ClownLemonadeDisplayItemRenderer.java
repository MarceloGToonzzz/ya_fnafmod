package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClownLemonadeDisplayModel;
import net.mcreator.yafnafmod.block.display.ClownLemonadeDisplayItem;

public class ClownLemonadeDisplayItemRenderer extends GeoItemRenderer<ClownLemonadeDisplayItem> {
	public ClownLemonadeDisplayItemRenderer() {
		super(new ClownLemonadeDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClownLemonadeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
