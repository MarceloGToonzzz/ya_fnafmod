package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ConcertSpeakerBlockModel;
import net.mcreator.yafnafmod.block.entity.ConcertSpeakerTileEntity;

public class ConcertSpeakerTileRenderer extends GeoBlockRenderer<ConcertSpeakerTileEntity> {
	public ConcertSpeakerTileRenderer() {
		super(new ConcertSpeakerBlockModel());
	}

	@Override
	public RenderType getRenderType(ConcertSpeakerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
