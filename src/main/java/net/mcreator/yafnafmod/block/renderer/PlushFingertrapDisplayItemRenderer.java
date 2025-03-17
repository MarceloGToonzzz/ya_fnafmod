package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PlushFingertrapDisplayModel;
import net.mcreator.yafnafmod.block.display.PlushFingertrapDisplayItem;

public class PlushFingertrapDisplayItemRenderer extends GeoItemRenderer<PlushFingertrapDisplayItem> {
	public PlushFingertrapDisplayItemRenderer() {
		super(new PlushFingertrapDisplayModel());
	}

	@Override
	public RenderType getRenderType(PlushFingertrapDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
