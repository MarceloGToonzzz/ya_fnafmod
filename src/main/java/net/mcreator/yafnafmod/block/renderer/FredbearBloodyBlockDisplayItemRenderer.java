package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FredbearBloodyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.FredbearBloodyBlockDisplayItem;

public class FredbearBloodyBlockDisplayItemRenderer extends GeoItemRenderer<FredbearBloodyBlockDisplayItem> {
	public FredbearBloodyBlockDisplayItemRenderer() {
		super(new FredbearBloodyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredbearBloodyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
