package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFreddyFuntimeBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFreddyFuntimeTileEntity;

public class CutoutFreddyFuntimeTileRenderer extends GeoBlockRenderer<CutoutFreddyFuntimeTileEntity> {
	public CutoutFreddyFuntimeTileRenderer() {
		super(new CutoutFreddyFuntimeBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFreddyFuntimeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
