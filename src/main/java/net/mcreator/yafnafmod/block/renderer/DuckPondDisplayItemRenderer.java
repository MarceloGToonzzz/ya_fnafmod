package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DuckPondDisplayModel;
import net.mcreator.yafnafmod.block.display.DuckPondDisplayItem;

public class DuckPondDisplayItemRenderer extends GeoItemRenderer<DuckPondDisplayItem> {
	public DuckPondDisplayItemRenderer() {
		super(new DuckPondDisplayModel());
	}

	@Override
	public RenderType getRenderType(DuckPondDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
