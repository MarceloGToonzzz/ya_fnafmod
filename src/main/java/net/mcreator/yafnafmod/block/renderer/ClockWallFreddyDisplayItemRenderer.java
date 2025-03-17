package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallFreddyDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallFreddyDisplayItem;

public class ClockWallFreddyDisplayItemRenderer extends GeoItemRenderer<ClockWallFreddyDisplayItem> {
	public ClockWallFreddyDisplayItemRenderer() {
		super(new ClockWallFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
