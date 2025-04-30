package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MusicBoxRedDecorationBlockModel;
import net.mcreator.yafnafmod.block.entity.MusicBoxRedDecorationTileEntity;

public class MusicBoxRedDecorationTileRenderer extends GeoBlockRenderer<MusicBoxRedDecorationTileEntity> {
	public MusicBoxRedDecorationTileRenderer() {
		super(new MusicBoxRedDecorationBlockModel());
	}

	@Override
	public RenderType getRenderType(MusicBoxRedDecorationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
