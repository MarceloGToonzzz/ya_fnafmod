package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.IndigoBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.IndigoBlockDisplayItem;

public class IndigoBlockDisplayItemRenderer extends GeoItemRenderer<IndigoBlockDisplayItem> {
	public IndigoBlockDisplayItemRenderer() {
		super(new IndigoBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(IndigoBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
