package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ConcertSpeakerDisplayModel;
import net.mcreator.yafnafmod.block.display.ConcertSpeakerDisplayItem;

public class ConcertSpeakerDisplayItemRenderer extends GeoItemRenderer<ConcertSpeakerDisplayItem> {
	public ConcertSpeakerDisplayItemRenderer() {
		super(new ConcertSpeakerDisplayModel());
	}

	@Override
	public RenderType getRenderType(ConcertSpeakerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
