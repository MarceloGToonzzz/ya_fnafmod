package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallSpringbonnieDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallSpringbonnieDisplayItem;

public class ClockWallSpringbonnieDisplayItemRenderer extends GeoItemRenderer<ClockWallSpringbonnieDisplayItem> {
	public ClockWallSpringbonnieDisplayItemRenderer() {
		super(new ClockWallSpringbonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallSpringbonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
