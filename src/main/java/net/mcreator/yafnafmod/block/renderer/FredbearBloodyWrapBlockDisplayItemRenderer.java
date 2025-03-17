package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FredbearBloodyWrapBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.FredbearBloodyWrapBlockDisplayItem;

public class FredbearBloodyWrapBlockDisplayItemRenderer extends GeoItemRenderer<FredbearBloodyWrapBlockDisplayItem> {
	public FredbearBloodyWrapBlockDisplayItemRenderer() {
		super(new FredbearBloodyWrapBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredbearBloodyWrapBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
