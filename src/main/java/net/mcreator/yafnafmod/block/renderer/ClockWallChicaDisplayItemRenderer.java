package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallChicaDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallChicaDisplayItem;

public class ClockWallChicaDisplayItemRenderer extends GeoItemRenderer<ClockWallChicaDisplayItem> {
	public ClockWallChicaDisplayItemRenderer() {
		super(new ClockWallChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
