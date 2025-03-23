package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FuntimeFoxyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.FuntimeFoxyBlockDisplayItem;

public class FuntimeFoxyBlockDisplayItemRenderer extends GeoItemRenderer<FuntimeFoxyBlockDisplayItem> {
	public FuntimeFoxyBlockDisplayItemRenderer() {
		super(new FuntimeFoxyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FuntimeFoxyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
