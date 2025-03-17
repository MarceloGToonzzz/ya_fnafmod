package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBalloraDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutBalloraDisplayItem;

public class CutoutBalloraDisplayItemRenderer extends GeoItemRenderer<CutoutBalloraDisplayItem> {
	public CutoutBalloraDisplayItemRenderer() {
		super(new CutoutBalloraDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutBalloraDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
