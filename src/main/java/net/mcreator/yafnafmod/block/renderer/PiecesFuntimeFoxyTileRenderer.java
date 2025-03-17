package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PiecesFuntimeFoxyBlockModel;
import net.mcreator.yafnafmod.block.entity.PiecesFuntimeFoxyTileEntity;

public class PiecesFuntimeFoxyTileRenderer extends GeoBlockRenderer<PiecesFuntimeFoxyTileEntity> {
	public PiecesFuntimeFoxyTileRenderer() {
		super(new PiecesFuntimeFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(PiecesFuntimeFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
