package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceRedGlassDoorWideBlockModel;
import net.mcreator.yafnafmod.block.entity.BigEntranceRedGlassDoorWideTileEntity;

public class BigEntranceRedGlassDoorWideTileRenderer extends GeoBlockRenderer<BigEntranceRedGlassDoorWideTileEntity> {
	public BigEntranceRedGlassDoorWideTileRenderer() {
		super(new BigEntranceRedGlassDoorWideBlockModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceRedGlassDoorWideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
