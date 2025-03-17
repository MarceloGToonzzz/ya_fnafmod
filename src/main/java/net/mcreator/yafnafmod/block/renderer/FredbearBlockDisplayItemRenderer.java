package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FredbearBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.FredbearBlockDisplayItem;

public class FredbearBlockDisplayItemRenderer extends GeoItemRenderer<FredbearBlockDisplayItem> {
	public FredbearBlockDisplayItemRenderer() {
		super(new FredbearBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredbearBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
