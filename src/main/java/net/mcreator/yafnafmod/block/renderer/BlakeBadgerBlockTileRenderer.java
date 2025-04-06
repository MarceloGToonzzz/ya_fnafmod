package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BlakeBadgerBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BlakeBadgerBlockTileEntity;

public class BlakeBadgerBlockTileRenderer extends GeoBlockRenderer<BlakeBadgerBlockTileEntity> {
	public BlakeBadgerBlockTileRenderer() {
		super(new BlakeBadgerBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BlakeBadgerBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
