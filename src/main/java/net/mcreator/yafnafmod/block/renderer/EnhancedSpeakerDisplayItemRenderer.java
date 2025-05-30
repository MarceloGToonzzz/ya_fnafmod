package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.EnhancedSpeakerDisplayModel;
import net.mcreator.yafnafmod.block.display.EnhancedSpeakerDisplayItem;

public class EnhancedSpeakerDisplayItemRenderer extends GeoItemRenderer<EnhancedSpeakerDisplayItem> {
	public EnhancedSpeakerDisplayItemRenderer() {
		super(new EnhancedSpeakerDisplayModel());
	}

	@Override
	public RenderType getRenderType(EnhancedSpeakerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
