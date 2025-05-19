package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SparkyDogBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.SparkyDogBlockTileEntity;

public class SparkyDogBlockTileRenderer extends GeoBlockRenderer<SparkyDogBlockTileEntity> {
	public SparkyDogBlockTileRenderer() {
		super(new SparkyDogBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(SparkyDogBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
