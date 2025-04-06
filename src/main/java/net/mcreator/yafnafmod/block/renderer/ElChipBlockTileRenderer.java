package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ElChipBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ElChipBlockTileEntity;

public class ElChipBlockTileRenderer extends GeoBlockRenderer<ElChipBlockTileEntity> {
	public ElChipBlockTileRenderer() {
		super(new ElChipBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ElChipBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
