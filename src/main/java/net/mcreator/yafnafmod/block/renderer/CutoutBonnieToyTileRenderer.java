package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBonnieToyBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutBonnieToyTileEntity;

public class CutoutBonnieToyTileRenderer extends GeoBlockRenderer<CutoutBonnieToyTileEntity> {
	public CutoutBonnieToyTileRenderer() {
		super(new CutoutBonnieToyBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutBonnieToyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
