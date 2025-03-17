package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CameraDisplayModel;
import net.mcreator.yafnafmod.block.display.CameraDisplayItem;

public class CameraDisplayItemRenderer extends GeoItemRenderer<CameraDisplayItem> {
	public CameraDisplayItemRenderer() {
		super(new CameraDisplayModel());
	}

	@Override
	public RenderType getRenderType(CameraDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
