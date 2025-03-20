package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BalloraBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.BalloraBlockDisplayItem;

public class BalloraBlockDisplayItemRenderer extends GeoItemRenderer<BalloraBlockDisplayItem> {
	public BalloraBlockDisplayItemRenderer() {
		super(new BalloraBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BalloraBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
