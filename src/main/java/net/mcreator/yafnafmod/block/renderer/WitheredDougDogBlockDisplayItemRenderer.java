package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredDougDogBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.WitheredDougDogBlockDisplayItem;

public class WitheredDougDogBlockDisplayItemRenderer extends GeoItemRenderer<WitheredDougDogBlockDisplayItem> {
	public WitheredDougDogBlockDisplayItemRenderer() {
		super(new WitheredDougDogBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredDougDogBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
