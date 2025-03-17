package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.GrandfatherClockDisplayModel;
import net.mcreator.yafnafmod.block.display.GrandfatherClockDisplayItem;

public class GrandfatherClockDisplayItemRenderer extends GeoItemRenderer<GrandfatherClockDisplayItem> {
	public GrandfatherClockDisplayItemRenderer() {
		super(new GrandfatherClockDisplayModel());
	}

	@Override
	public RenderType getRenderType(GrandfatherClockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
