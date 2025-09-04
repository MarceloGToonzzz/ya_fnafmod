package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigDecoratedGlassEntranceDoorWideBlockModel;
import net.mcreator.yafnafmod.block.entity.BigDecoratedGlassEntranceDoorWideTileEntity;

public class BigDecoratedGlassEntranceDoorWideTileRenderer extends GeoBlockRenderer<BigDecoratedGlassEntranceDoorWideTileEntity> {
	public BigDecoratedGlassEntranceDoorWideTileRenderer() {
		super(new BigDecoratedGlassEntranceDoorWideBlockModel());
	}

	@Override
	public RenderType getRenderType(BigDecoratedGlassEntranceDoorWideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
