package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MusicManBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.MusicManBlockTileEntity;

public class MusicManBlockTileRenderer extends GeoBlockRenderer<MusicManBlockTileEntity> {
	public MusicManBlockTileRenderer() {
		super(new MusicManBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(MusicManBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
