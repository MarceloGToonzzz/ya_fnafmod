package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFreddyRetroBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFreddyRetroTileEntity;

public class CutoutFreddyRetroTileRenderer extends GeoBlockRenderer<CutoutFreddyRetroTileEntity> {
	public CutoutFreddyRetroTileRenderer() {
		super(new CutoutFreddyRetroBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFreddyRetroTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
