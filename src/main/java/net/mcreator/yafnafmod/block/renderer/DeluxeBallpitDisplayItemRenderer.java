package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeluxeBallpitDisplayModel;
import net.mcreator.yafnafmod.block.display.DeluxeBallpitDisplayItem;

public class DeluxeBallpitDisplayItemRenderer extends GeoItemRenderer<DeluxeBallpitDisplayItem> {
	public DeluxeBallpitDisplayItemRenderer() {
		super(new DeluxeBallpitDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeluxeBallpitDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
