package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallFoxyDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallFoxyDisplayItem;

public class ClockWallFoxyDisplayItemRenderer extends GeoItemRenderer<ClockWallFoxyDisplayItem> {
	public ClockWallFoxyDisplayItemRenderer() {
		super(new ClockWallFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
