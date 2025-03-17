package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyFreddyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ToyFreddyBlockDisplayItem;

public class ToyFreddyBlockDisplayItemRenderer extends GeoItemRenderer<ToyFreddyBlockDisplayItem> {
	public ToyFreddyBlockDisplayItemRenderer() {
		super(new ToyFreddyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
