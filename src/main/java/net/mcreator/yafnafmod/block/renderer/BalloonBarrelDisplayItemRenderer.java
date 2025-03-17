package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BalloonBarrelDisplayModel;
import net.mcreator.yafnafmod.block.display.BalloonBarrelDisplayItem;

public class BalloonBarrelDisplayItemRenderer extends GeoItemRenderer<BalloonBarrelDisplayItem> {
	public BalloonBarrelDisplayItemRenderer() {
		super(new BalloonBarrelDisplayModel());
	}

	@Override
	public RenderType getRenderType(BalloonBarrelDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
