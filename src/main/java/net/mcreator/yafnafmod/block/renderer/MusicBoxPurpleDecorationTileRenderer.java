package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MusicBoxPurpleDecorationBlockModel;
import net.mcreator.yafnafmod.block.entity.MusicBoxPurpleDecorationTileEntity;

public class MusicBoxPurpleDecorationTileRenderer extends GeoBlockRenderer<MusicBoxPurpleDecorationTileEntity> {
	public MusicBoxPurpleDecorationTileRenderer() {
		super(new MusicBoxPurpleDecorationBlockModel());
	}

	@Override
	public RenderType getRenderType(MusicBoxPurpleDecorationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
