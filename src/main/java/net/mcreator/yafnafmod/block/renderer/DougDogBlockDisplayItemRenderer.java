package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DougDogBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.DougDogBlockDisplayItem;

public class DougDogBlockDisplayItemRenderer extends GeoItemRenderer<DougDogBlockDisplayItem> {
	public DougDogBlockDisplayItemRenderer() {
		super(new DougDogBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(DougDogBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
