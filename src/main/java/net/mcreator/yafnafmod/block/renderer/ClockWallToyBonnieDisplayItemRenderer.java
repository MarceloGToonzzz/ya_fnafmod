package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallToyBonnieDisplayModel;
import net.mcreator.yafnafmod.block.display.ClockWallToyBonnieDisplayItem;

public class ClockWallToyBonnieDisplayItemRenderer extends GeoItemRenderer<ClockWallToyBonnieDisplayItem> {
	public ClockWallToyBonnieDisplayItemRenderer() {
		super(new ClockWallToyBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClockWallToyBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
