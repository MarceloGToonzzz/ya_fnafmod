package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.EnhancedSpeakerBlockModel;
import net.mcreator.yafnafmod.block.entity.EnhancedSpeakerTileEntity;

public class EnhancedSpeakerTileRenderer extends GeoBlockRenderer<EnhancedSpeakerTileEntity> {
	public EnhancedSpeakerTileRenderer() {
		super(new EnhancedSpeakerBlockModel());
	}

	@Override
	public RenderType getRenderType(EnhancedSpeakerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
