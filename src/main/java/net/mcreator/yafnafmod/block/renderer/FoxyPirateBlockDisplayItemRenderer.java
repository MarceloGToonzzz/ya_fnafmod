package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FoxyPirateBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.FoxyPirateBlockDisplayItem;

public class FoxyPirateBlockDisplayItemRenderer extends GeoItemRenderer<FoxyPirateBlockDisplayItem> {
	public FoxyPirateBlockDisplayItemRenderer() {
		super(new FoxyPirateBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyPirateBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
