package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScrapSparkyDogBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ScrapSparkyDogBlockTileEntity;

public class ScrapSparkyDogBlockTileRenderer extends GeoBlockRenderer<ScrapSparkyDogBlockTileEntity> {
	public ScrapSparkyDogBlockTileRenderer() {
		super(new ScrapSparkyDogBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ScrapSparkyDogBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
