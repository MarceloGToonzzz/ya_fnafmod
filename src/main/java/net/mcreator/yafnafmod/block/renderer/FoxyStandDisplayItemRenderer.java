package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FoxyStandDisplayModel;
import net.mcreator.yafnafmod.block.display.FoxyStandDisplayItem;

public class FoxyStandDisplayItemRenderer extends GeoItemRenderer<FoxyStandDisplayItem> {
	public FoxyStandDisplayItemRenderer() {
		super(new FoxyStandDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyStandDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
