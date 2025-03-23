package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScraptrapBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ScraptrapBlockTileEntity;

public class ScraptrapBlockTileRenderer extends GeoBlockRenderer<ScraptrapBlockTileEntity> {
	public ScraptrapBlockTileRenderer() {
		super(new ScraptrapBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ScraptrapBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
