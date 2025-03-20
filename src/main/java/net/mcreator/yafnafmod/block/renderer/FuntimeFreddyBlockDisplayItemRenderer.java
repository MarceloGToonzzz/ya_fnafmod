package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FuntimeFreddyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.FuntimeFreddyBlockDisplayItem;

public class FuntimeFreddyBlockDisplayItemRenderer extends GeoItemRenderer<FuntimeFreddyBlockDisplayItem> {
	public FuntimeFreddyBlockDisplayItemRenderer() {
		super(new FuntimeFreddyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FuntimeFreddyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
