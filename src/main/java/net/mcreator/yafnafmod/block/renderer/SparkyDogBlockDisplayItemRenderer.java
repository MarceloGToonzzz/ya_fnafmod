package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SparkyDogBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.SparkyDogBlockDisplayItem;

public class SparkyDogBlockDisplayItemRenderer extends GeoItemRenderer<SparkyDogBlockDisplayItem> {
	public SparkyDogBlockDisplayItemRenderer() {
		super(new SparkyDogBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(SparkyDogBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
