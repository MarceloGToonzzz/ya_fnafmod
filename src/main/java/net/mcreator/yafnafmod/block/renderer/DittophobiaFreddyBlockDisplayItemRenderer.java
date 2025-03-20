package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaFreddyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.DittophobiaFreddyBlockDisplayItem;

public class DittophobiaFreddyBlockDisplayItemRenderer extends GeoItemRenderer<DittophobiaFreddyBlockDisplayItem> {
	public DittophobiaFreddyBlockDisplayItemRenderer() {
		super(new DittophobiaFreddyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaFreddyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
