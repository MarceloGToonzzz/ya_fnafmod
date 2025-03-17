package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LargeFanDisplayModel;
import net.mcreator.yafnafmod.block.display.LargeFanDisplayItem;

public class LargeFanDisplayItemRenderer extends GeoItemRenderer<LargeFanDisplayItem> {
	public LargeFanDisplayItemRenderer() {
		super(new LargeFanDisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeFanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
