package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallBonnieDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallBonnieDisplayItem;

public class ClockWallBonnieDisplayItemRenderer extends GeoItemRenderer<ClockWallBonnieDisplayItem> {
	public ClockWallBonnieDisplayItemRenderer() {
		super(new ClockWallBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
