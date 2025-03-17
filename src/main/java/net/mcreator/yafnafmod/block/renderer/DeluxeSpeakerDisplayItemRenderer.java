package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeluxeSpeakerDisplayModel;
import net.mcreator.yafnafmod.block.display.DeluxeSpeakerDisplayItem;

public class DeluxeSpeakerDisplayItemRenderer extends GeoItemRenderer<DeluxeSpeakerDisplayItem> {
	public DeluxeSpeakerDisplayItemRenderer() {
		super(new DeluxeSpeakerDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeluxeSpeakerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
