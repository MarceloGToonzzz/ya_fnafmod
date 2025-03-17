package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceRedGlassDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigEntranceRedGlassDoorTileEntity;

public class BigEntranceRedGlassDoorTileRenderer extends GeoBlockRenderer<BigEntranceRedGlassDoorTileEntity> {
	public BigEntranceRedGlassDoorTileRenderer() {
		super(new BigEntranceRedGlassDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceRedGlassDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
