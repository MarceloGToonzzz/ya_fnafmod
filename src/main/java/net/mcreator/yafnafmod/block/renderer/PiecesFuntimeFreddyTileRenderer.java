package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PiecesFuntimeFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.PiecesFuntimeFreddyTileEntity;

public class PiecesFuntimeFreddyTileRenderer extends GeoBlockRenderer<PiecesFuntimeFreddyTileEntity> {
	public PiecesFuntimeFreddyTileRenderer() {
		super(new PiecesFuntimeFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(PiecesFuntimeFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
