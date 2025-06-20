package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyFoxyHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.ToyFoxyHeadDisplayItem;

public class ToyFoxyHeadDisplayItemRenderer extends GeoItemRenderer<ToyFoxyHeadDisplayItem> {
	public ToyFoxyHeadDisplayItemRenderer() {
		super(new ToyFoxyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFoxyHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
