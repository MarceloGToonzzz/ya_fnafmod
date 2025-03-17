package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallToyFoxyDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallToyFoxyDisplayItem;

public class ClockWallToyFoxyDisplayItemRenderer extends GeoItemRenderer<ClockWallToyFoxyDisplayItem> {
	public ClockWallToyFoxyDisplayItemRenderer() {
		super(new ClockWallToyFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallToyFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
