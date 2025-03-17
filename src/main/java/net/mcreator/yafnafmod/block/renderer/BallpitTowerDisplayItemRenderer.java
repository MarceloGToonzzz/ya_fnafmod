package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BallpitTowerDisplayModel;
import net.mcreator.yafnafmod.block.display.BallpitTowerDisplayItem;

public class BallpitTowerDisplayItemRenderer extends GeoItemRenderer<BallpitTowerDisplayItem> {
	public BallpitTowerDisplayItemRenderer() {
		super(new BallpitTowerDisplayModel());
	}

	@Override
	public RenderType getRenderType(BallpitTowerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
