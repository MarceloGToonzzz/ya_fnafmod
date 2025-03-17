package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallFredbearDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallFredbearDisplayItem;

public class ClockWallFredbearDisplayItemRenderer extends GeoItemRenderer<ClockWallFredbearDisplayItem> {
	public ClockWallFredbearDisplayItemRenderer() {
		super(new ClockWallFredbearDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallFredbearDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
