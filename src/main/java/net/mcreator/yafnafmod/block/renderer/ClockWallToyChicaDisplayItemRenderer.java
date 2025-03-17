package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallToyChicaDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallToyChicaDisplayItem;

public class ClockWallToyChicaDisplayItemRenderer extends GeoItemRenderer<ClockWallToyChicaDisplayItem> {
	public ClockWallToyChicaDisplayItemRenderer() {
		super(new ClockWallToyChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallToyChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
