package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBabyBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutBabyTileEntity;

public class CutoutBabyTileRenderer extends GeoBlockRenderer<CutoutBabyTileEntity> {
	public CutoutBabyTileRenderer() {
		super(new CutoutBabyBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutBabyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
