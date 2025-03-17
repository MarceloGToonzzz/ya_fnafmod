package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FoxyPirateFixedBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FoxyPirateFixedBlockTileEntity;

public class FoxyPirateFixedBlockTileRenderer extends GeoBlockRenderer<FoxyPirateFixedBlockTileEntity> {
	public FoxyPirateFixedBlockTileRenderer() {
		super(new FoxyPirateFixedBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FoxyPirateFixedBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
