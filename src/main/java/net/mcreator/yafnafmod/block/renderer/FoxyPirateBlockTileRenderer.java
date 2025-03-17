package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FoxyPirateBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FoxyPirateBlockTileEntity;

public class FoxyPirateBlockTileRenderer extends GeoBlockRenderer<FoxyPirateBlockTileEntity> {
	public FoxyPirateBlockTileRenderer() {
		super(new FoxyPirateBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FoxyPirateBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
