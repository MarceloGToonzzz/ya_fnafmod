package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FryingPanBlockModel;
import net.mcreator.yafnafmod.block.entity.FryingPanTileEntity;

public class FryingPanTileRenderer extends GeoBlockRenderer<FryingPanTileEntity> {
	public FryingPanTileRenderer() {
		super(new FryingPanBlockModel());
	}

	@Override
	public RenderType getRenderType(FryingPanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
