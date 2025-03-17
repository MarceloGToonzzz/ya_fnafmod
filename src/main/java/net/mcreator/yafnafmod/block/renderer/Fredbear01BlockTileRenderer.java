package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fredbear01BlockBlockModel;
import net.mcreator.yafnafmod.block.entity.Fredbear01BlockTileEntity;

public class Fredbear01BlockTileRenderer extends GeoBlockRenderer<Fredbear01BlockTileEntity> {
	public Fredbear01BlockTileRenderer() {
		super(new Fredbear01BlockBlockModel());
	}

	@Override
	public RenderType getRenderType(Fredbear01BlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
