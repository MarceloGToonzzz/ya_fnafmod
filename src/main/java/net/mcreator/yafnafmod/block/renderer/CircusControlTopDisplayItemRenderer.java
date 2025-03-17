package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CircusControlTopDisplayModel;
import net.mcreator.yafnafmod.block.display.CircusControlTopDisplayItem;

public class CircusControlTopDisplayItemRenderer extends GeoItemRenderer<CircusControlTopDisplayItem> {
	public CircusControlTopDisplayItemRenderer() {
		super(new CircusControlTopDisplayModel());
	}

	@Override
	public RenderType getRenderType(CircusControlTopDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
