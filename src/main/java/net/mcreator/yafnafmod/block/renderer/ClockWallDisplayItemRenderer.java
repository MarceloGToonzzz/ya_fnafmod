package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallDisplayItem;

public class ClockWallDisplayItemRenderer extends GeoItemRenderer<ClockWallDisplayItem> {
	public ClockWallDisplayItemRenderer() {
		super(new ClockWallDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
