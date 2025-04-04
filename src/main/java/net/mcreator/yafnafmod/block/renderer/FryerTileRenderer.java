package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FryerBlockModel;
import net.mcreator.yafnafmod.block.entity.FryerTileEntity;

public class FryerTileRenderer extends GeoBlockRenderer<FryerTileEntity> {
	public FryerTileRenderer() {
		super(new FryerBlockModel());
	}

	@Override
	public RenderType getRenderType(FryerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
