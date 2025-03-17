package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutTreeOakBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutTreeOakTileEntity;

public class CutoutTreeOakTileRenderer extends GeoBlockRenderer<CutoutTreeOakTileEntity> {
	public CutoutTreeOakTileRenderer() {
		super(new CutoutTreeOakBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutTreeOakTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
