package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeluxeSpeakerBlockModel;
import net.mcreator.yafnafmod.block.entity.DeluxeSpeakerTileEntity;

public class DeluxeSpeakerTileRenderer extends GeoBlockRenderer<DeluxeSpeakerTileEntity> {
	public DeluxeSpeakerTileRenderer() {
		super(new DeluxeSpeakerBlockModel());
	}

	@Override
	public RenderType getRenderType(DeluxeSpeakerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
