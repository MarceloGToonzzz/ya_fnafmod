package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyFreddyHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.ToyFreddyHeadDisplayItem;

public class ToyFreddyHeadDisplayItemRenderer extends GeoItemRenderer<ToyFreddyHeadDisplayItem> {
	public ToyFreddyHeadDisplayItemRenderer() {
		super(new ToyFreddyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddyHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
