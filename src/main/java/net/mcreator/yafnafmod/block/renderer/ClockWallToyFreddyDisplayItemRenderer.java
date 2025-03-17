package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallToyFreddyDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallToyFreddyDisplayItem;

public class ClockWallToyFreddyDisplayItemRenderer extends GeoItemRenderer<ClockWallToyFreddyDisplayItem> {
	public ClockWallToyFreddyDisplayItemRenderer() {
		super(new ClockWallToyFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallToyFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
