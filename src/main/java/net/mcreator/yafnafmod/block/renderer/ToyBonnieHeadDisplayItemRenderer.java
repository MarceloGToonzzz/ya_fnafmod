package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyBonnieHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.ToyBonnieHeadDisplayItem;

public class ToyBonnieHeadDisplayItemRenderer extends GeoItemRenderer<ToyBonnieHeadDisplayItem> {
	public ToyBonnieHeadDisplayItemRenderer() {
		super(new ToyBonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyBonnieHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
