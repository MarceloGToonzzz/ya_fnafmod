package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BallpitRottenDisplayModel;
import net.mcreator.yafnafmod.block.display.BallpitRottenDisplayItem;

public class BallpitRottenDisplayItemRenderer extends GeoItemRenderer<BallpitRottenDisplayItem> {
	public BallpitRottenDisplayItemRenderer() {
		super(new BallpitRottenDisplayModel());
	}

	@Override
	public RenderType getRenderType(BallpitRottenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
