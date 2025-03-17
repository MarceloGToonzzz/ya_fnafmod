package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MusicBoxDecorationBlockModel;
import net.mcreator.yafnafmod.block.entity.MusicBoxDecorationTileEntity;

public class MusicBoxDecorationTileRenderer extends GeoBlockRenderer<MusicBoxDecorationTileEntity> {
	public MusicBoxDecorationTileRenderer() {
		super(new MusicBoxDecorationBlockModel());
	}

	@Override
	public RenderType getRenderType(MusicBoxDecorationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
