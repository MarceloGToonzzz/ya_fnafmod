package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyFoxyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ToyFoxyBlockDisplayItem;

public class ToyFoxyBlockDisplayItemRenderer extends GeoItemRenderer<ToyFoxyBlockDisplayItem> {
	public ToyFoxyBlockDisplayItemRenderer() {
		super(new ToyFoxyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFoxyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
