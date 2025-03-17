package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BallpitVintageDisplayModel;
import net.mcreator.yafnafmod.block.display.BallpitVintageDisplayItem;

public class BallpitVintageDisplayItemRenderer extends GeoItemRenderer<BallpitVintageDisplayItem> {
	public BallpitVintageDisplayItemRenderer() {
		super(new BallpitVintageDisplayModel());
	}

	@Override
	public RenderType getRenderType(BallpitVintageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
