package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FredbearHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.FredbearHeadDisplayItem;

public class FredbearHeadDisplayItemRenderer extends GeoItemRenderer<FredbearHeadDisplayItem> {
	public FredbearHeadDisplayItemRenderer() {
		super(new FredbearHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredbearHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
